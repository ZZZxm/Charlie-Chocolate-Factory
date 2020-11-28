package team.charliechocolatefactory.product.chocolateProduct.chocolatemix;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import team.charliechocolatefactory.product.chocolate.Chocolate;
import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.rawmaterial.packagematerial.Box;
import team.charliechocolatefactory.product.Product;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname ChocolateMix
 * @description Mixed chocolate pack. This is a part of Flyweight Pattern.
 * @date 2020/11/23 23:40
 */
public class ChocolateMix extends Product {
// fields
    private final Chocolate[] chocolates;

    /**
     * ctor of ChocolateMix
     *
     * @param typeList List of extended class of Chocolate. Eg: MilkChocolate.class
     * @throws NewInstanceFailureException Thrown when failed to create an instance.
     */
    public ChocolateMix(List<Class<? extends Chocolate>> typeList)
            throws NewInstanceFailureException {
        super("Chocolate Mix", Integer.MAX_VALUE, 0);
        Chocolate chocolate = null;
        int chocolateShelfLife = 0;
        int index = 0;

        chocolates = new Chocolate[typeList.size()];
        for (Class<? extends Chocolate> type : typeList) {
            chocolate = MixChocolateFactory.getChocolate(type);
            chocolates[index] = chocolate;
            weight += chocolate.getWeight();
            chocolateShelfLife = chocolate.getShelfLife();
            if (chocolateShelfLife < shelfLife) {
                shelfLife = chocolateShelfLife;
            }
            index++;
        }
        this.initIngredientList();
    }

    /**
     * Get chocolate instance at index.
     *
     * @param index index of instance
     * @return chocolate instance
     */
    public Chocolate at(int index) {
        if (index >= 0 && index < chocolates.length) {
            return chocolates[index];
        } else {
            return null;
        }
    }

    @Override
    public void packaging() {
        super.gotoNextState();
        System.out.println("Start packaging Chocolate Mix...");
        super.pack = new Box(0);
        super.gotoNextState();
        System.out.println("Finish packaging Chocolate Mix.");
        super.gotoNextState();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
    }

    @Override
    protected void initIngredientList() {
        for (Chocolate chocolate : chocolates) {
            for (RawMaterial material : chocolate.ingredientList) {
                if (!ingredientList.contains(material)) {
                    ingredientList.add(material);
                }
            }
        }
    }

}
