package team.charliechocolatefactory.product.chocolate;

import javafx.scene.Scene;
import team.charliechocolatefactory.rawmaterial.Nut;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname SandwichChocolate
 * @description this is SandwichChocolate with nut
 * @date 2020/11/8 15:23
 */
public class SandwichChocolate extends Chocolate {

//fields
    public Nut nut;

// constructor

    /**
     * @param loc
     */
    public SandwichChocolate(Scene loc, Nut nut) {
        super("Sandwich chocolate", loc, 6, 20, 0.5);
        this.nut = nut;
        this.initIngredientList();
    }

// methods
    /**
     * @return nut
     */
    public Nut getNut() {
        return this.nut;
    }

    /**
     * initialize the ingredient list of the sandwich chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add("CocoaBean");
        super.ingredientList.add("Water");
        super.ingredientList.add("Sugar");
        super.ingredientList.add("Nut");
    }

    /**
     * override the toString method
     * @return
     */
    @Override
    public String toString(){
        return "subclass : SandwichChocolate";
    }
}