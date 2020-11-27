package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author TT
 * @project chocolateFactory
 * @classname FireHydrant
 * @description fire hydrant
 * @date 2020/11/18 15:34
 */
public class FireHydrant extends ResidenceDecorator {

    public FireHydrant(){
        this(null);
    }

    public FireHydrant(Residence r){
        super(r);
        System.out.println("A fire hydrant has been added");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 1000; //Infrared alarm 100yuan/per
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
        return "class FireHydrant extends ResidenceDecorator";
    }
}

