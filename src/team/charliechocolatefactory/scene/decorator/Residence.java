package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.Scene;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Residence
 * @description this is residence
 * @date 2020/11/18 14:19
 */
public abstract class Residence extends Scene implements DecoratorComponent {

    public Residence() {
        this(0.0);
    }

    public Residence(String location, double cost, double area) {
        super(location, cost, area);
    }

    /**
     * show the cost of the residence
     */
    public Residence(double x) {
        super(x);
    }

    /**
     * String representing the description of the residence
     */
    public abstract String getDescription();

    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

    @Override
    public abstract String toString();
}
