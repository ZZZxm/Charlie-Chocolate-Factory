package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.rawmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.Sugar;
import team.charliechocolatefactory.rawmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname WhiteChocolate
 * @description this is white chocolate.
 * @date 2020/11/8 15:15
 */
public class WhiteChocolate extends Chocolate{

// constructor
    public WhiteChocolate() {
        super("White chocolate", 12,5, 0.1);
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
