package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.decorator.Residence;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Villa
 * @description This is a villa
 * @date 2020/11/24 20:30
 */
public class Villa extends Residence {

    /**
     * Show that a villa has been built
     */
    public Villa() {
        super(50000);
        System.out.println("A villa has been built");
    }

    @Override
    public String getDescription() {
        return "This is a villa";
    }

    /**
     * Return the build cost
     */
    @Override
    public double getBuildCost() {
        return 50000;
    }

    @Override
    public String toString() {
        return "class Villa extends Residence";
    }

    @Override
    public void accept(UtilityWorker worker) {

    }
}
