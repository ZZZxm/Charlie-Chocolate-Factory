package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Monitor
 * @description this is residence with monitor
 * @date 2020/11/18 14:34
 */
public class Monitor extends ResidenceDecorator {

    public Monitor() {
        this(null);
    }

    /**
     * Add a monitor to the residence
     */
    public Monitor(DecoratorComponent r) {
        super(r);
        System.out.println("A monitor has been added");
    }

    /**
     * Return the cost of the residence
     */
    @Override
    public double getBuildCost() {
        return residence.getBuildCost() + 500; //table 500yuan/per
    }

    /**
     * String representing the description of residence
     */
    @Override
    public String getDescription() {
        return residence.getDescription();
    }

    @Override
    public String toString() {
        return "class Monitor extends ResidenceDecorator";
    }
}