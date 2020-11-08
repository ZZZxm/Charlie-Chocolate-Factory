package team.charliechocolatefactory.person.staff;

import javafx.scene.Scene;
import team.charliechocolatefactory.person.staff.worker.Worker;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Manager
 * @description A manager is responsible for one department.
 * @date 2020/11/7 17:17
 */
public class Manager extends Staff{

    public Manager(String name, int age, Sex sex, int salary, Scene department) {
        super(name, age, sex, salary, department);
    }

    /**
     * Manager can hire workers for the department he/she is responsible for.
     */
    public void hireWorker() {
        if(true /* 该部门人未满 */) {
            /* 加入员工 */
        }
    }

    /**
     * Manager can fire workers for the department he/she is responsible for.
     */
    public boolean fireWorker(Worker worker) {
        if (department == worker.getDepartment()) {
            /* 删除员工 */
            return true;
        }
        else {
            System.out.println("The worker is not responsible to the manager.");
            return false;
        }
    }

    @Override
    protected void setInitialAsset() {
        this.asset = 100000;
    }

    @Override
    public String toString() {
        return "class Manager extends Staff";
    }
}
