package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.Scene;

import java.util.ArrayList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname StaffArea
 * @description Inherited from basic class scene, it represents scenes only open for staffs.
 * @date 2020/11/9 19:44
 */
public abstract class StaffArea extends Scene {

    /** Manager of the staff area **/
    protected Manager manager;

    /** List of all workers in the area **/
    protected ArrayList<Worker> workerList;

    /**
    * Constructor of StaffArea with no manager specified
    */
    public StaffArea(String location, double cost, double area) {
        this(location, cost, area, null);
    }

    /**
     * Constructor of StaffArea with manager specified
     */
    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<>();
        manager = newManager;
    }

    /**
     * get the manager of the area
     * @return manager of the staff area
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * set the new manager of the staff area
     * @param newManager new manager of the StaffArea
     */
    public void setManager(Manager newManager) {
        manager = newManager;
    }

    /**
     * create and add a worker to the area
     * @param name name of the worker
     * @param age age of the worker
     * @param sex sex of the worker
     * @param salary salary of the worker
     */
    public abstract void addWorker(String name, int age, Person.Sex sex, int salary);

    /**
     * remove a worker from this staff area if the worker is in the list
     * @param workerObj object of the worker to be removed
     */
    public void removeWorker(Worker workerObj) {
        if (workerList.contains(workerObj)) {
            workerList.remove(workerObj);
        } else {
            System.out.println("Worker object doesn't exist.");
        }
    }

    /**
     * check whether object of a worker is in the staff area
     * @param workerObj worker object
     * @return true if the worker is in the area
     */
    public boolean checkWorker(Worker workerObj) {
        return workerList.contains(workerObj);
    }

    /**
     * get the worker list
     * @return the worker list of the staff area
     */
    public ArrayList<Worker> getWorkerList()
    {
        return new ArrayList<Worker>(workerList);
    }

}
