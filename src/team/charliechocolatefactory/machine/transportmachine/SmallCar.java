package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname SmallCar
 * @description Machine for transporting a small quantity of items.
 * @date 2020/11/8 19:34
 */
public class SmallCar extends TransportMachine {
    public SmallCar(String type, String machineNum) {
        super(type, machineNum, 20, 0.6, 50);
    }

    public SmallCar(String type, String machineNum, double age) {
        super(type, machineNum, age, 20, 0.6, 50);
    }

    public String toString() {
        return "class SmallCar";
    }
}
