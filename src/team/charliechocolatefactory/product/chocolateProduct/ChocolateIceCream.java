package team.charliechocolatefactory.product.chocolateProduct;

import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.Cup;
import team.charliechocolatefactory.scene.Scene;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateIceCream
 * @description TODO
 * @date 2020/11/8 15:26
 */
public class ChocolateIceCream extends Product {

// constructor
    /**
     * @param loc
     */
    public ChocolateIceCream(Scene loc) {
        super("Chocolate Ice-cream", loc, 12, 200);
        this.initIngredientList();
    }

    @Override
    public void packaging() {
        System.out.println("Start packaging Chocolate Ice-cream...");
        super.pack = new Cup(0);
        super.state = 2;
        System.out.println("Finish packaging.");
        super.state = 3;

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
        return;
    }

    /**
     * initialize the ingredient list of chocolate ice-cream
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("DarkChocolate");
        super.ingredientList.add("Milk");
        super.ingredientList.add("Sugar");
        super.ingredientList.add("Water");
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : ChocolateIceCream";
    }
}