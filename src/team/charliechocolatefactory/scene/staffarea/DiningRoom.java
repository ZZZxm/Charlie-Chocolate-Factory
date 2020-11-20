package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.DinningRoomWorker;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname DiningRoom
 * @description Used for staffs to have breakfast, lunch or supper.
 * @date 2020/11/9 20:00
 */
public class DiningRoom extends StaffArea {

    /**
     * constructor of the DiningRoom with no manager specified
     */
    public DiningRoom(String location, double cost, double area) {
        super(location, cost, area);
    }

    public DiningRoom() {
        super();
    }

    /**
     * constructor of the DiningRoom with manager specified
     */
    public DiningRoom(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return "dining room";
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
        DinningRoomWorker workerObj = new DinningRoomWorker(name, age, sex, salary, this);
        workerList.add(workerObj);
    }

    /**
     * maintain the devices in the dining room
     */
    public void getDevicesMaintained() {
        System.out.println("The tables and cookers have been maintained.");
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
