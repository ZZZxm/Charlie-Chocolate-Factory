package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.WorkerIterator.Aggregate;
import team.charliechocolatefactory.scene.staffarea.WorkerIterator.Iterator;
import team.charliechocolatefactory.scene.staffarea.WorkerIterator.WorkerListIterator;

import java.util.ArrayList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname StaffArea
 * @description Inherited from basic class scene, it represents scenes only open for staffs.
 * ConcreteAggregate of the Iterator.
 * @date 2020/11/9 19:44
 */
public abstract class StaffArea extends Scene implements Aggregate {

    /**
     * Manager of the staff area
     **/
    protected Manager manager;

    /**
     * List of all workers in the area
     **/
    protected ArrayList<Worker> workerList = null;

    /**
     * Constructor of StaffArea with no manager specified
     */
    public StaffArea(String location, double cost, double area) {
        this(location, cost, area, null);
        workerList = new ArrayList<Worker>();
    }

    public StaffArea() {
        super();
    }

    /**
     * Constructor of StaffArea with manager specified
     */
    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<Worker>();
        manager = newManager;
        GeneralManager.getInstance().addManager(manager);
    }


    /**
     * get the manager of the area
     *
     * @return manager of the staff area
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * set the new manager of the staff area
     *
     * @param newManager new manager of the StaffArea
     */
    public void setManager(Manager newManager) {
        manager = newManager;
    }


    /**
     * create and add a worker to the area
     *
     * @param name   name of the worker
     * @param age    age of the worker
     * @param sex    sex of the worker
     * @param salary salary of the worker
     */
    public abstract void addWorker(String name, int age, Person.Sex sex, int salary);

    /**
     * remove a worker from this staff area if the worker is in the list
     *
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
     * get the worker list
     *
     * @return the worker list of the staff area
     */
    public ArrayList<Worker> getWorkerList() {
        return workerList;
    }

    /**
     * @return an Iterator that copies the protected WorkerList
     */
    @Override
    public Iterator getIterator() {
        return new WorkerListIterator(workerList);
    }

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(UtilityWorker worker);

    @Override
    public String toString() {
        return "class StaffArea extends Scene and implements Aggregate";
    }
}
