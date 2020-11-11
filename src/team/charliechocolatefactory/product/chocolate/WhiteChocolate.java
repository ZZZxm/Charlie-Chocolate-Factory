package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.scene.Scene;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname WhiteChocolate
 * @description this is white chocolate.
 * @date 2020/11/8 15:15
 */
public class WhiteChocolate extends Chocolate{

// constructor
    /**
     * @param loc
     */
    public WhiteChocolate(Scene loc) {
        super("White chocolate", loc, 12,5, 0.1);
        this.initIngredientList();
    }


    /**
     * initialize the ingredient list of white chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("Water");
        super.ingredientList.add("CocoaBean");
        super.ingredientList.add("Sugar");
        return;
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : WhiteChocolate";
    }
}
