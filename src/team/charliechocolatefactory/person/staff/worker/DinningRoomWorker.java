package team.charliechocolatefactory.person.staff.worker;

import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname DinningRoomWorker
 * @description TODO
 * @date 2020/11/11 16:20
 */
public class DinningRoomWorker extends Worker {

    public DinningRoomWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("The dining room worker " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The dining room worker" + this.name + "goes to rest.");
    }
}
