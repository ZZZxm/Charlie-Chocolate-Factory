package team.charliechocolatefactory.product.chocolateProduct;

import javafx.scene.Scene;
import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.Bag;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateWafer
 * @description this is chocolate wafer
 * @date 2020/11/8 15:27
 */
public class ChocolateWafer extends Product {

// constructor
    /**
     * @param loc
     */
    public ChocolateWafer(Scene loc) {
        super("Chocolate Wafer", loc, 18, 100);
        this.initIngredientList();
    }

// methods
    @Override
    protected void packaging() {
        System.out.println("Start packaging Chocolate Ice-cream...");
        super.pack = new Bag(0);
        super.state = 2;
        System.out.println("Finish packaging.");
        super.state = 3;

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
        return;
    }

    /**
     * initialize the ingredient list of chocolate wafer
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("DarkChocolate");
        super.ingredientList.add("Butter");
        super.ingredientList.add("Egg");
        super.ingredientList.add("Flour");
        super.ingredientList.add("Nut");
        super.ingredientList.add("Sugar");
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : ChocolateWafer";
    }
}
