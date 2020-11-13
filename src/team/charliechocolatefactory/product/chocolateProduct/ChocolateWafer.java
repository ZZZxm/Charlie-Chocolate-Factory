package team.charliechocolatefactory.product.chocolateProduct;

import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.*;
import team.charliechocolatefactory.scene.Scene;

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
    public ChocolateWafer() {
        super("Chocolate Wafer", 18, 100);
        this.initIngredientList();
    }

// methods
    @Override
    public void packaging() {
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
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Butter());
        super.ingredientList.add(new Egg());
        super.ingredientList.add(new Flour());
        super.ingredientList.add(new Nut());
        super.ingredientList.add(new Sugar());
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
