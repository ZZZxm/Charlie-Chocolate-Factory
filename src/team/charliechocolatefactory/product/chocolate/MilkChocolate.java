package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.rawmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.Milk;
import team.charliechocolatefactory.rawmaterial.Sugar;

import java.io.Serializable;

/**
 * @author Kerr, Zeus Lee
 * @project chocolateFactory
 * @classname MilkChocolate
 * @description this is milk chocolate.
 * @date 2020/11/8 15:16
 */
public class MilkChocolate extends Chocolate implements Serializable,Cloneable {

//fields
    protected double milkContent;

//constructor
    public MilkChocolate() {
        super("Milk chocolate", 18,15, 0.3);
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

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : Milk Chocolate";
    }
<<<<<<< Updated upstream
=======

    public void setCocoaBeanNum(double cocoaBeanNum) {
        this.cocoaBeanNum = cocoaBeanNum;
    }

    public void setSugarNum(double sugarNum) {
        this.sugarNum = sugarNum;
    }

    public void setMilkNum(double milkNum) {
        this.milkNum = milkNum;
    }

    @Override
    public void dispaly() {
        System.out.println("this is MilkChocolate!!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
>>>>>>> Stashed changes
}
