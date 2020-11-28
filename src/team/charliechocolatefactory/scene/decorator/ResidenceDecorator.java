package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname ResidenceDecorator
 * @description this represents the decoration of residence
 * @date 2020/11/18 14:25
 */
public abstract class ResidenceDecorator implements DecoratorComponent {
    protected DecoratorComponent residence;      //Residence decorated by the ResidenceDecorator

    public ResidenceDecorator() { }

    /**
     * Represents the decorated residence
     */
    public ResidenceDecorator(DecoratorComponent r) {
        residence = r;
    }

    /**
     * Return the cost of present residence
     */

//    public abstract double getCost();

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }
}
