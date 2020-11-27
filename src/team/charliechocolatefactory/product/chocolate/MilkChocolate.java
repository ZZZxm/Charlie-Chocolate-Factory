package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.rawmaterial.foodmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Milk;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Sugar;

import java.io.Serializable;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MilkChocolate
 * @description this is milk chocolate.
 * @date 2020/11/8 15:16
 */
public class MilkChocolate extends Chocolate implements Serializable, Cloneable {

    //fields
    protected double milkContent;
    private double cocoaBeanNum = 100;
    private double sugarNum = 5;
    private double milkNum = 0.5;

    //constructor
    public MilkChocolate() {
        super("Milk chocolate", 18, 15, 0.3);
    }

    //constructor
    public MilkChocolate(Sandwich sandwich) {
        super("Milk chocolate", 18, 15, 0.3, sandwich);
        this.milkContent = 0.4;
        this.initIngredientList();
    }

    /**
     * @return milk's content
     */
    public double getMilkContent() {
        return this.milkContent;
    }

    /**
     * how many grams' milk is needed;
     *
     * @return
     */
    public double getMilkWeight() {
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

    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public String getNameWithSandwich() {
        return sandwich.getSandwich() + " MilkChocolate";
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : Milk Chocolate";
    }


    public void setCocoaBeanNum(double cocoaBeanNum) {
        this.cocoaBeanNum = cocoaBeanNum;
    }

    public void setSugarNum(double sugarNum) {
        this.sugarNum = sugarNum;
    }

    public void setMilkNum(double milkNum) {
        this.milkNum = milkNum;
    }

    public double getCocoaBeanNum() {
        return cocoaBeanNum;
    }

    public double getMilkNum() {
        return milkNum;
    }

    public double getSugarNum() {
        return sugarNum;
    }

    @Override
    public void dispaly() {
        System.out.println("this is MilkChocolate!!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(MilkChocolate milkChocolate) {
        return this.cocoaBeanNum == milkChocolate.getCocoaBeanNum() && this.sugarNum == milkChocolate.getSugarNum() && this.milkNum == milkChocolate.getMilkNum();
    }
}