package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.rawmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.Nut;
import team.charliechocolatefactory.rawmaterial.Sugar;
import team.charliechocolatefactory.rawmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname SandwichChocolate
 * @description this is SandwichChocolate with nut
 * @date 2020/11/8 15:23
 */
public class SandwichChocolate extends Chocolate {
// constructor

    public SandwichChocolate() {
        super("Sandwich chocolate", 6, 20, 0.5);
        this.initIngredientList();
    }

// methods

    /**
     * initialize the ingredient list of the sandwich chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Nut());
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : SandwichChocolate";
    }
}