package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.product.Product;

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

    @Override
    public int work(Product product) {
        if (product == null) {
            return super.work(product);
        } else {
            System.out.println("Sorry, small cars cannot transport products.");
            return 0;
        }
    }

    @Override
    protected void load(Product product) {
        System.out.println("Four people are getting on the small car.");
    }

    @Override
    protected void arrive(Product product) {
        System.out.println("Four people arrive at the destination.");
    }

    public String toString() {
        return "class SmallCar";
    }
}
