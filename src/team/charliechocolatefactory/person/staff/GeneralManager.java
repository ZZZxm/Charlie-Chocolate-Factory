package team.charliechocolatefactory.person.staff;

import javafx.scene.Scene;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname GeneralManager
 * @description There is only one general manager of the chocolate factory.
 * @date 2020/11/7 18:13
 */
public class GeneralManager extends Staff{

    public GeneralManager(String name, int age, Sex sex, int salary, Scene department) {
        super(name, age, sex, salary, department);
    }

    @Override
    protected void setInitialAsset() {
        this.asset = 1000000;
    }

    @Override
    public String toString() {
        return "class GeneralManager extends Staff";
    }
}
