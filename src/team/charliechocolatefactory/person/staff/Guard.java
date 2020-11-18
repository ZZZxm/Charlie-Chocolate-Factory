package team.charliechocolatefactory.person.staff;

import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Guard
 * @description a kind of staff
 * @date 2020/11/10 15:27
 */
public class Guard extends Staff{

    public String identity="guard";

    public Guard(String name, int age, Sex sex, int salary, StaffArea workingArea) {
        super(name, age, sex, salary, workingArea);
    }

    @Override
    protected void setInitialAsset() {
        this.asset = 500;
    }

    @Override
    public String toString() {
        return "class Guard extends Staff";
    }
}
