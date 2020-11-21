package team.charliechocolatefactory.product.chocolate;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.rawmaterial.foodmaterial.CocoaBean;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Matcha;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Sugar;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MatchaChocolate
 * @description this is matcha chocolate
 * @date 2020/11/8 15:41
 */
public class MatchaChocolate extends Chocolate {

    //fields
    protected double matchaContent;

    // constructor
    public MatchaChocolate() {
        super("Matcha chocolate", 18, 8, 0.4);
    }

    // constructor
    public MatchaChocolate(Sandwich sandwich) {
        super("Matcha chocolate", 18, 8, 0.4, sandwich);
        this.matchaContent = 0.2;
        this.initIngredientList();
    }

// methods

    /**
     * @return matcha's content
     */
    public double getMatchaContent() {
        return this.matchaContent;
    }

    /**
     * how many grams' matcha is needed
     *
     * @return
     */
    public double getMatchaWieght() {
        return this.matchaContent * this.weight;
    }

    /**
     * initialize the ingredient list of matcha chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Matcha());
    }

    public String getNameWithSandwich() {
        return sandwich.getSandwich() + " MatchaChocolate";
    }

    /**
     * override the to string method
     *
     * @return a String
     */
    @Override
    public String toString() {
        return "Subclass : Matcha Chocolate";
    }

    @Override
    public void dispaly() {

    }
}
