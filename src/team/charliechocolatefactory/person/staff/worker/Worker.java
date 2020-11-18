package team.charliechocolatefactory.person.staff.worker;

import team.charliechocolatefactory.person.staff.Staff;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Worker
 * @description A low-level employee of a factory, attached to a department 工厂的底层员工，隶属于某个部门
 * @date 2020/11/7 16:55
 */
public abstract class Worker extends Staff {

    public String identity="worker";

    public Worker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public Worker(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    /**
     * set the initial asset of the worker
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 10000;
    }

    @Override
    public String toString() {
        return "class Worker extends Staff";
    }

    /** work */
    public abstract void work();

    /** rest */
    public abstract void rest();
}
