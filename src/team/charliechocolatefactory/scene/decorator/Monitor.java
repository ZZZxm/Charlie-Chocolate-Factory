package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Monitor
 * @description monitor
 * @date 2020/11/18 14:34
 */
public class Monitor extends ResidenceDecorator {

    public Monitor() {
        this(null);
    }

    public Monitor(Residence r) {
        super(r);
        System.out.println("A monitor has been added");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 500; //table 500yuan/per
    }

    @Override
    public void accept(UtilityWorker worker) {

    }

    @Override
    public String getDescription() {
        return residence.getDescription();
    }

    @Override
    public String toString() {
        return "class Monitor extends ResidenceDecorator";
    }
}