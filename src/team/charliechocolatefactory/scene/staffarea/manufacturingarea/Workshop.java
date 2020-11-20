package team.charliechocolatefactory.scene.staffarea.manufacturingarea;

import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname Workshop
 * @description Workshop where the production is produced
 * @date 2020/11/9 20:05
 */
public class Workshop extends ManufacturingArea {

    /**
     * Constructor of Workshop with no manager specified
     */
    public Workshop(String location, double cost, double area) {
        this(location, cost, area, null);
    }

    /**
     * Constructor of Workshop with no manager specified
     */
    public Workshop(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }


     /**
    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return "workshop";
    }


    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

}
