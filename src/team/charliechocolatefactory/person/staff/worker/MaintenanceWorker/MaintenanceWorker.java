package team.charliechocolatefactory.person.staff.worker.MaintenanceWorker;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MaintenanceWorker
 * @description The employees who repair the machine,the Handler of Chain of Responsibility
 * @date 2020/11/14 19:15
 */
public abstract class MaintenanceWorker extends Worker {

    private MaintenanceWorker next;

    public MaintenanceWorker(String name, int age, Person.Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("The maintenance worker" + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The maintenance worker" + this.name + "goes to rest.");
    }

    public void setNext(MaintenanceWorker next) {
        this.next = next;
    }
    public MaintenanceWorker getNext() {
        return next;
    }

    /**
     * method to process repair request
     * @param attritionRate:The degree of wear and tear of the machine=age/lifeYear
     * @return  whether handleRequest or not
     */
    public abstract boolean handleRequest(double attritionRate);
}
