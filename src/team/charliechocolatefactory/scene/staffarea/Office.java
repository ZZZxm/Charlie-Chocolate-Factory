package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.SceneNameConst;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname Office
 * @description As One kind of staff area, it represents office building.
 * @date 2020/11/9 20:04
 */
public class Office extends StaffArea {

//    /**
//     * constructor of the Office with no manager specified
//     */
//    public Office(String location, double cost, double area) {
//        super(location, cost, area);
//    }

    public Office() {
        this("Default Office", 100, 100);
    }

    /**
     * constructor of the Office with no manager specified
     */
    public Office(String location, double cost, double area) {
        super(location, cost, area, Manager.officeManager);
        Manager.officeManager.addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.officeManager);
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

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return SceneNameConst.OFFICE;
    }
}
