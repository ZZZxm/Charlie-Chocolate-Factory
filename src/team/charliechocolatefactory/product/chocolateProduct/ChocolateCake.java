package team.charliechocolatefactory.product.chocolateProduct;

import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateCake
 * @description this is chocolate cake, the feature of which is the size.
 *                  Here I've defined size to stand for the radius of the cake.
 * @date 2020/11/8 15:25
 */
public class ChocolateCake extends Product {

// fields
    protected int size; //how many inches is its radius

//constructor
    /**
     * @param size
     */
    public ChocolateCake(int size) {
        super("Chocolate Cake", 1, size*size*100);
        this.size = size;
        this.initIngredientList();
    }

// methods
    /**
     * initialize the ingredient list of chocolate cake
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Egg());
        super.ingredientList.add(new Flour());
        super.ingredientList.add(new Butter());
        super.ingredientList.add(new EdibleGoldLeaf());
    }

    /**
     * @return cake's size
     */
    public int getSize(){
        return this.size;
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : ChocolateCake";
    }

}
