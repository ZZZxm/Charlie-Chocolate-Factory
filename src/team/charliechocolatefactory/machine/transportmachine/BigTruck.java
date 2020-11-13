package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BigTruck
 * @description Machine for transporting a large quantity of items.
 * @date 2020/11/8 19:55
 */
public class BigTruck extends TransportMachine {
    public BigTruck(String type, String machineNum) {
        super(type, machineNum, 10, 1, 400);
    }

    public BigTruck(String type, String machineNum, double age) {
        super(type, machineNum, age, 10, 1, 400);
    }

    public String toString() {
        return "class BigTruck";
    }
}
