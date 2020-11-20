package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.OfficeWorker;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

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

    }

    /**
     * constructor of the Office with no manager specified
     */
    public Office(String location, double cost, double area) {
        super(location, cost, area, Manager.officeManager);
        Manager.officeManager.addDepartment(this);
    }

    /**
     * create and add a worker to the area
     *
     * @param name   name of the worker
     * @param age    age of the worker
     * @param sex    sex of the worker
     * @param salary salary of the worker
     */
    @Override
    public void addWorker(String name, int age, Person.Sex sex, int salary) {
        OfficeWorker workerObj = new OfficeWorker(name, age, sex, salary, this);
        workerList.add(workerObj);
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
        return "office";
    }
}
