package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Flat
 * @description flat
 * @date 2020/11/24 20:35
 */
public class Flat extends Residence {


    public Flat() {

        super(30000);

        System.out.println("A flat has been built");
    }


    @Override
    public String getDescription() {
        return "This is a flat";
    }


    @Override
    public String toString() {
        return "class ReceptionCenter extends Residence";
    }

    @Override
    public void accept(UtilityWorker worker) {

    }
}

