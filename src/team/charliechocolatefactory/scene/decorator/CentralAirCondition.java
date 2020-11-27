package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author TT
 * @project chocolateFactory
 * @classname CentralAirCondition
 * @description TODO
 * @date 2020/11/18 14:35
 */
public class CentralAirCondition extends ResidenceDecorator {

    public CentralAirCondition() {

    }

    public CentralAirCondition(Residence r) {
        super(r);
        System.out.println("A central air condition has been added");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 200; //chair 200yuan/per
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
        return "class CentralAirCondition extends ResidenceDecorator";
    }
}
