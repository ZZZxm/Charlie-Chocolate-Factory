package team.charliechocolatefactory.person.staff.worker.fixworker;

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
public abstract class FixWorker extends Worker {

    private FixWorker next;

    public FixWorker(String name, int age, Person.Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public FixWorker(String name, int age, Person.Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The fix worker " + this.name + " is working.");
    }

    @Override
    public void rest() {
        System.out.println("The fix worker " + this.name + " goes to rest.");
    }

    public void setNext(FixWorker next) {
        this.next = next;
    }

    public FixWorker getNext() {
        return next;
    }

    /**
     * method to process repair request
     *
     * @param breakLevel:the degree of machine failure
     * @return whether handleRequest or not
     */
    public abstract boolean handleRequest(int breakLevel);
}