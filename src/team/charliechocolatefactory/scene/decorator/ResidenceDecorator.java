package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname ResidenceDecorator
 * @description this represents the decoration of residence
 * @date 2020/11/18 14:25
 */
public abstract class ResidenceDecorator implements DecoratorComponent {

    /**
     * Residence decorated by the ResidenceDecorator
     */
    protected DecoratorComponent residence;

    public ResidenceDecorator() {
        this(null);
    }

    /**
     * Represents the decorated residence
     */
    public ResidenceDecorator(DecoratorComponent r) {
        residence = r;
    }

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }
}
