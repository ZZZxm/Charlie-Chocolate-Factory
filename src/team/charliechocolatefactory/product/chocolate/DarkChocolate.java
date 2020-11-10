package team.charliechocolatefactory.product.chocolate;

import javafx.scene.Scene;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname DarkChocolate
 * @description this is dark chocolate
 * @date 2020/11/8 15:15
 */
public class DarkChocolate extends Chocolate{

// constructor
    /**
     * @param loc
     */
    public DarkChocolate( Scene loc) {
        super("Dark chocolate", loc, 18,10, 0.78);
        this.initIngredientList();
    }

    /**
     * initialize the ingredient list of dark chocolate.
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("CocoaBean");
        super.ingredientList.add("Water");
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : DarkChocolate";
    }
}
