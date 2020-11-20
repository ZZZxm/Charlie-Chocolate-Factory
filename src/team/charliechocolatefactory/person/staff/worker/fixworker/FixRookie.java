package team.charliechocolatefactory.person.staff.worker.fixworker;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MaintenanceRookie
 * @description the Concrete Handler of Chain of Responsibility
 * @date 2020/11/14 20:49
 */
public class FixRookie extends FixWorker {
    public FixRookie(String name, int age, Person.Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("The fix rookie" + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The fix rookie" + this.name + "goes to rest.");
    }

    @Override
    public void feedBack() {

    }

    public boolean handleRequest(int breakLevel) {
        if (breakLevel <= 3) {
            work();
            return true;
        } else {
            if (getNext() != null) {
                if (getNext().handleRequest(breakLevel)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("This machine is broken! Cannot be repaired!");
                return false;
            }
        }
    }
}