package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname CommercialVehicle
 * @description Machine for transporting a medium quantity of items.
 * @date 2020/11/8 19:54
 */
public class Van extends TransportMachine {
    public Van(String type, String machineNum) {
        super(type, machineNum, 15, 0.8, 150);
    }

    public Van(String type, String machineNum, double age) {
        super(type, machineNum, age, 15, 0.8, 150);
    }

    @Override
    protected void load(Product product) {
        System.out.println("Four people are getting on the van and " +
                this.aimProcessNum + " " + product.getName() + "are being loaded on the van.");
    }

    @Override
    protected void arrive(Product product) {
        System.out.println("Four people and " +
                this.aimProcessNum + " " + product.getName() + "arrive at the destination.");
    }

    public String toString() {
        return "class Van";
    }
}
