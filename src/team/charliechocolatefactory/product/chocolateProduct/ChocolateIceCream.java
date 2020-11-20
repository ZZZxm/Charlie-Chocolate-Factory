package team.charliechocolatefactory.product.chocolateProduct;

import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.foodmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Milk;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Sugar;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateIceCream
 * @description TODO
 * @date 2020/11/8 15:26
 */
public class ChocolateIceCream extends Product {

    // constructor
    public ChocolateIceCream() {
        super("Chocolate Ice-cream", 12, 200);
        this.initIngredientList();
    }

    /**
     * initialize the ingredient list of chocolate ice-cream
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : ChocolateIceCream";
    }
}
