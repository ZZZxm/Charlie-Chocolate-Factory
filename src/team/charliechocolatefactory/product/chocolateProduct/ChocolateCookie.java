package team.charliechocolatefactory.product.chocolateProduct;

import javafx.scene.Scene;
import packageSource.box.Box;
import team.charliechocolatefactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateCookie
 * @description this is chocolate cookie, cookie's feature is its shape. Here I've defined a enum called Shape.
 * @date 2020/11/8 15:22
 */
public class ChocolateCookie extends Product {

//fields
    public enum Shape{CAT,DOG,HORSE,HUMAN,APPLE,STAR,TREE,SUN}
    public Shape shape;

// constructor
    /**
     * @param loc
     */
    public ChocolateCookie(Scene loc, Shape shape) {
        super("Chocolate Cookie", loc, 6, 7);
        this.shape = shape;
        this.initIngredientList();
    }

// methods
    @Override
    protected void packaging() {
        System.out.println("Start packaging Chocolate Cookies...");
        super.pack = new Box();
        super.state = 2;
        System.out.println("Finish packaging.");
        super.state = 3;

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
        return;
    }

    /**
     * initialize the ingredient list of chocolate cookie
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("DarkChocolate");
        super.ingredientList.add("Butter");
        super.ingredientList.add("Egg");
        super.ingredientList.add("Flour");
        super.ingredientList.add("Milk");
        super.ingredientList.add("Sugar");
        super.ingredientList.add("Water");
    }

    /**
     * @return the shape of cookie
     */
    public Shape getShape(){
        return this.shape;
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : ChocolateCookie";
    }

}
