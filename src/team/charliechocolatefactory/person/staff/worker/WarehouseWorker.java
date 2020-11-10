package team.charliechocolatefactory.person.staff.worker;

import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WarehouseWorker
 * @description worker of a warehouse
 * @date 2020/11/9 22:06
 */
public class WarehouseWorker extends Worker {

    public WarehouseWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("Warehouse Worker" + this.name + "is working.");
    }
}
