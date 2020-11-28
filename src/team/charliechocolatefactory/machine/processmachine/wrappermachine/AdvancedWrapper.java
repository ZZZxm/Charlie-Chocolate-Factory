package team.charliechocolatefactory.machine.processmachine.wrappermachine;


/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname AdvancedWrapper
 * @description Machine for wrapping a large quantity of products.
 * @date 2020/11/8 22:17
 */
public class AdvancedWrapper extends WrapperMachine {
    public AdvancedWrapper(String type, String machineNum) {
        super(type, machineNum, 50, 1.2, 500);
    }

    public AdvancedWrapper(String type, String machineNum, double age) {
        super(type, machineNum, age, 50, 1.2, 500);
    }

    public String toString() {
        return "class AdvancedWrapper";
    }
}
