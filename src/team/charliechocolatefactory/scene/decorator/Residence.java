package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.Scene;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Residence
 * @description TODO
 * @date 2020/11/18 14:19
 */
public abstract class Residence extends Scene {
    public Residence() {
        this(0.0);
    }

    public Residence(double x) {
        super(x);
    }

    public abstract String getDescription();

    @Override
    public abstract String toString();

    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

}
