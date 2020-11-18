package team.charliechocolatefactory.person.staff.worker;

import team.charliechocolatefactory.scene.staffarea.StaffArea;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.Workshop;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WorkshopWorker
 * @description worker in the workshop
 * @date 2020/11/11 16:16
 */
public class WorkshopWorker extends Worker {

    public WorkshopWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public WorkshopWorker(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The workshop worker" + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The workshop worker" + this.name + "goes to rest.");
    }
}
