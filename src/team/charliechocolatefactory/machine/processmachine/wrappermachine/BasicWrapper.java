package team.charliechocolatefactory.machine.processmachine.wrappermachine;


/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BasicWrapper
 * @description Machine for wrapping a small quantity of products.
 * @date 2020/11/8 22:14
 */
public class BasicWrapper extends WrapperMachine {
    public BasicWrapper(String type, String machineNum) {
        super(type, machineNum, 30, 1.5, 250);
    }

    public BasicWrapper(String type, String machineNum, double age) {
        super(type, machineNum, age, 30, 1.5, 250);
    }

    public String toString() {
        return "class BasicWrapper";
    }
}
