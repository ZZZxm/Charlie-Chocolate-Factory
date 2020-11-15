package team.charliechocolatefactory.product.chocolateProduct.chocolatemix;

import java.text.SimpleDateFormat;
import java.util.Date;

import team.charliechocolatefactory.product.chocolate.Chocolate;
import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.rawmaterial.Box;
import team.charliechocolatefactory.product.Product;

/**
 * @project chocolateFactory
 * @classname ChocolateMix
 * @description Mixed chocolate pack. This is a part of Flyweight Pattern.
 * @author Ngae Zeh-ghau
 * @date 2020/11/15 22:08
 */
public class ChocolateMix extends Product {

	private final Chocolate[] chocolates;

	/**
	 * TODO
	 * 
	 * @param typeList
	 * @throws NewInstanceFailureException
	 */
	public ChocolateMix(Class<? extends Chocolate>[] typeList) throws NewInstanceFailureException {
		super("Chocolate Mix", Integer.MAX_VALUE, 0);
		Chocolate chocolate = null;
		int chocolateShelfLife = 0;

		chocolates = new Chocolate[typeList.length];
		for (int i = 0; i < typeList.length; i++) {
			chocolate = MixChocolateFactory.getChocolate(typeList[i]);
			chocolates[i] = chocolate;
			weight += chocolate.getWeight();
			chocolateShelfLife = chocolate.getShelfLife();
			if (chocolateShelfLife < shelfLife) {
				shelfLife = chocolateShelfLife;
			}
		}
	}

	/**
	 * 
	 * @param index
	 * @return
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
		return;
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
