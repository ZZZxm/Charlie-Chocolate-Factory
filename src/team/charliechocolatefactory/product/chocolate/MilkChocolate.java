package product.chocolate;

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
    public MilkChocolate(Scene loc, double content) {
        super("Milk chocolate", loc, 18,15, 0.3);
        this.milkContent = milkContent;
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
}
