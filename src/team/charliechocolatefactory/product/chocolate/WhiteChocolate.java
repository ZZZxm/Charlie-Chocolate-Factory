package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.rawmaterial.foodmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Sugar;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname WhiteChocolate
 * @description this is white chocolate.
 * @date 2020/11/8 15:15
 */
public class WhiteChocolate extends Chocolate {

    // constructor
    public WhiteChocolate() {
        super("White chocolate", 12, 5, 0.1);
    }

    // constructor
    public WhiteChocolate(Sandwich sandwich) {
        super("White chocolate", 12, 5, 0.1, sandwich);
        this.initIngredientList();
    }


    /**
     * initialize the ingredient list of white chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new Water());
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Sugar());
    }

    @Override
    public String getNameWithSandwich() {
        return sandwich.getSandwich() + " WhiteChocolate";
    }

    @Override
    public String toString() {
        return "subclass : WhiteChocolate";
    }

    @Override
    public void dispaly() {

    }
}
