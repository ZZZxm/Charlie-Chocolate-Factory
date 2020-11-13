package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.Machine;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname TransportMachine
 * @description Inherited from Machine, this class is the abstract class of all the transport machines.
 * @date 2020/11/8 14:03
 */
public abstract class TransportMachine extends Machine {

    public TransportMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }

    public TransportMachine(String type, String machineNum, double age, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, age, lifeYear, lossCoefficient, maxCapacity);
    }

    @Override
    protected int work(Product product) {
        String name = product.getName();
        System.out.println(aimProcessNum + " " + name + " transported successfully.");
        return 0;
    }

    /**
     * designed for transporting items without explicit names
     *
     * @return a int
     */
    protected int work() {
        System.out.println(aimProcessNum + " items transported successfully.");
        return 0;
    }

    public String toString() {
        return "class TransportMachine";
    }
}
