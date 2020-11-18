package team.charliechocolatefactory.prototype.copy;

import team.charliechocolatefactory.factory.product.MilkChocolate;
import team.charliechocolatefactory.prototype.material.Agg;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolateCake
 * @description
 * We need cloned classes, chocolate cake classes,
 * This class mainly tests Deep copies
 * @date 2020/11/15 17:14
 */

/**
 * must implements Cloneable.
 * The first method of deep copy directly rewrites our clone method
 */
public class ChocolateCakeDeepCopy1 implements Cloneable {

    /**
     * ChocolateCake name;
     */
    private String name;

    /**
     * Chocolate cake contains eggs
     */
    private Agg agg;

    /**
     * Chocolate cake contains chocolate,this user factor pattern MilkChocolate;
     */
    private MilkChocolate chocolate;

    /**
     * All parameter constructed functions
     * @param name:ChocolateCake name;
     * @param agg:ChocolateCake agg;
     * @param chocolate:ChocolateCake:chocolate
     */
    public ChocolateCakeDeepCopy1(String name, Agg agg, MilkChocolate chocolate) {
        this.name = name;
        this.agg = agg;
        this.chocolate = chocolate;
    }


    /**
     * @return this class name;
     */
    public String getName() {
        return name;
    }

    /**
     * @param name:set this class name;
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return: this class agg;
     */
    public Agg getAgg() {
        return agg;
    }

    /**
     * @param agg:set this class agg;
     */
    public void setAgg(Agg agg) {
        this.agg = agg;
    }

    /**
     * @return: get this chololege;
     */
    public MilkChocolate getChocolate() {
        return chocolate;
    }

    /**
     * @return: set this chololege;
     */
    public void setChocolate(MilkChocolate chocolate) {
        this.chocolate = chocolate;
    }

    /**
     * We manually implemented the clone method to implement a deep copy of our classes.
     * @return:Duix after cloning
     * @throws CloneNotSupportedException:Class whose type cannot be converted
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        ChocolateCakeDeepCopy1 chocolateCakeDeepCopy1 = (ChocolateCakeDeepCopy1) super.clone();
        /**
         * We call the deep copy method of our properties separately to copy.
         * Because we are not under a package, there may be access problems.
         * Therefore, we must ensure that the clone method can be accessed in the current class.
         */
        chocolateCakeDeepCopy1.agg = (Agg) chocolateCakeDeepCopy1.agg.clone();
        chocolateCakeDeepCopy1.chocolate = (MilkChocolate) chocolateCakeDeepCopy1.chocolate.clone();
        return chocolateCakeDeepCopy1;
    }
}
