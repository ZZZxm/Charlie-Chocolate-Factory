package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname ResidenceDecorator
 * @description TODO
 * @date 2020/11/18 14:25
 */
public abstract class ResidenceDecorator extends Residence {
    protected Residence residence;      //Residence decorated by the ResidenceDecorator

    public ResidenceDecorator() {
    }


    public ResidenceDecorator(Residence r) {
        residence = r;
    }

    @Override
    public abstract double getCost();

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }
}
