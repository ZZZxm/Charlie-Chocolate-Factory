package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.Machine;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname TransportMachine
 * @description TODO Design Pattern --- Template Method
 * Inherited from Machine, this class is the abstract class of all the transport machines.
 * @date 2020/11/8 14:03
 */
public abstract class TransportMachine extends Machine {

    public TransportMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }

    public TransportMachine(String type, String machineNum, double age, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, age, lifeYear, lossCoefficient, maxCapacity);
    }


    /**
     * function work() for transport machine aims to transport products or persons from one place to another
     *
     * @param product a Product
     * @return
     */
    @Override
    protected int work(Product product) {
        load(product);
        System.out.println("On the way to the destination...");
        arrive(product);
        return 0;
    }

    /**
     * loading the product or persons into the transport machine
     */
    protected abstract void load(Product product);

    /**
     * debus the product or persons
     */
    protected abstract void arrive(Product product);

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
