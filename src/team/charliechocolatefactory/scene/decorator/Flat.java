package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Flat
 * @description This is a flat
 * @date 2020/11/24 20:35
 */
public class Flat extends Residence {

    /**
     * Show the a flat has been built
     */
    public Flat(){
        super(30000);
        System.out.println("A flat has been built");
    }

    /**
     * String representing the description of the residence
     */
    @Override
    public String getDescription() {
        return "This is a flat";
    }

    /**
     * Return the build cost
     */
    @Override
    public double getBuildCost() {
        return 30000;
    }

    @Override
    public String toString() {
        return "class ReceptionCenter extends Residence";
    }

    @Override
    public void accept(UtilityWorker worker) {

    }
}

