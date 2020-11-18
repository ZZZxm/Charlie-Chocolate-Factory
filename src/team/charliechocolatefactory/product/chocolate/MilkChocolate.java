package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.rawmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.Milk;
import team.charliechocolatefactory.rawmaterial.Sugar;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MilkChocolate
 * @description this is milk chocolate.
 * @date 2020/11/8 15:16
 */
public class MilkChocolate extends Chocolate {

//fields
    protected double milkContent;

//constructor
    public MilkChocolate(Sandwich sandwich) {
        super("Milk chocolate", 18,15, 0.3,sandwich);
        this.milkContent = 0.4;
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
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Milk());
    }
    public String getNameWithSandwich() {
        return sandwich.getSandwich()+" MilkChocolate";
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
