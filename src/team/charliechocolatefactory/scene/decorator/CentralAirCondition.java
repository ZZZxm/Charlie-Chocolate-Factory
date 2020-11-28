package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname CentralAirCondition
 * @description this is a residence with centralAirCondition
 * @date 2020/11/18 14:35
 */

public class CentralAirCondition extends ResidenceDecorator {

    public CentralAirCondition() {
        this(null);
    }


    /**
     * Add a central air condition to the residence
     */
    public CentralAirCondition(DecoratorComponent r) {
        super(r);
        System.out.println("A central air condition has been added");
    }

    /**
     * Return the build cost of residence WITH central air condition
     */
    @Override
    public double getBuildCost() {
        return residence.getBuildCost() + 200; //chair 200yuan/per
    }


    /**
     * String representing the description of the residence
     */
    @Override
    public String getDescription() {
        return residence.getDescription();
    }

    @Override
    public String toString() {
        return "class CentralAirCondition extends ResidenceDecorator";
    }
}
