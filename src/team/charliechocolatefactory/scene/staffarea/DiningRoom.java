package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.DinningRoomWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;

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

    /**
     * constructor of the DiningRoom with manager specified
     */
    public DiningRoom(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }

    /**
     * create and add a worker to the area
     * @param name name of the worker
     * @param age age of the worker
     * @param sex sex of the worker
     * @param salary salary of the worker
     */
    @Override
    public void addWorker(String name, int age, Person.Sex sex, int salary) {
        DinningRoomWorker workerObj = new DinningRoomWorker(name, age, sex, salary, this);
        workerList.add(workerObj);
    }

}
