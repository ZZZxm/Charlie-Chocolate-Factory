package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.rawmaterial.foodmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname DarkChocolate
 * @description this is dark chocolate
 * @date 2020/11/8 15:15
 */
public class DarkChocolate extends Chocolate {

    // constructor
    public DarkChocolate() {
        super("Dark chocolate", 18, 10, 0.78);
    }

    // constructor
    public DarkChocolate(Sandwich sandwich) {
        super("Dark chocolate", 18, 10, 0.78, sandwich);
        this.initIngredientList();
    }

    /**
     * initialize the ingredient list of dark chocolate.
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
    }

    @Override
    public String getNameWithSandwich() {
        return sandwich.getSandwich() + " DarkChocolate";
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : DarkChocolate";
    }
}
