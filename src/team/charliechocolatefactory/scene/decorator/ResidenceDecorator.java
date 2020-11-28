package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname ResidenceDecorator
 * @description residence decorator
 * @date 2020/11/18 14:25
 */
public abstract class ResidenceDecorator implements ResidenceComponent {
    protected Residence residence;      //Residence decorated by the ResidenceDecorator

    public ResidenceDecorator() {
        this(null);
    }

    public ResidenceDecorator(Residence r) {
        residence = r;
    }


    public abstract double getBuildCost();

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }
}
