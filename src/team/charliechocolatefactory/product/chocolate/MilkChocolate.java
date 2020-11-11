package team.charliechocolatefactory.product.chocolate;

import javafx.scene.Scene;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MilkChocolate
 * @description this is milk chocolate.
 * @date 2020/11/8 15:16
 */
public class MilkChocolate extends Chocolate {

//fields
    public double milkContent;

//constructor
    /**
     * @param loc
     */
    public MilkChocolate(Scene loc) {
        super("Milk chocolate", loc, 18,15, 0.3);
        this.milkContent = 0.2;
        this.initIngredientList();
    }

    /**
     * @return milk's content
     */
    public double getMilkContent(){
        return this.milkContent;
    }

    /**
     * how many grams' milk is needed;
     * @return
     */
    public double getMilkWeight(){
        return this.milkContent * this.weight;
    }

    /**
     * initialize the ingredient list of the milk chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("CocoaBean");
        super.ingredientList.add("Sugar");
        super.ingredientList.add("Milk");
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : Milk Chocolate";
    }
}
