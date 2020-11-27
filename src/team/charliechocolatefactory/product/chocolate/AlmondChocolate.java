package team.charliechocolatefactory.product.chocolate;


import team.charliechocolatefactory.product.Sandwich.Sandwich;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname AlmondChocolate
 * @description AlmondChocolate
 * @date 2020/11/15 16:31
 */

/**
 * modified
 * @author Kerr
 * impelement abstract method getNameWithSandwich() to make it can work.
 */
public class AlmondChocolate extends Chocolate {

// constructor
    public AlmondChocolate() {
        super(null, 0, 0, 0.0);
    }

    public AlmondChocolate(String name, int shelfLife, int weight, double content, Sandwich sandwich) {
        super(name, shelfLife, weight, content, sandwich);
    }

    /**
     * This method can show the type of this class。
     */
    @Override
    public void dispaly() {
        System.out.println("this is AlmondChocolate!");
    }

    @Override
    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public String getNameWithSandwich() {
        return null;
    }

    @Override
    protected void initIngredientList() {

    }
}
