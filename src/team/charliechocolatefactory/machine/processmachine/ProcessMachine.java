package team.charliechocolatefactory.machine.processmachine;

import team.charliechocolatefactory.machine.Machine;
import team.charliechocolatefactory.product.Product;

import java.util.Random;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ProcessMachine
 * @description Inherited from Machine, this class is the abstract class of all the process machines.
 * @date 2020/11/8 0:04
 */
public abstract class ProcessMachine extends Machine {

    public ProcessMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }

    public ProcessMachine(String type, String machineNum, double age, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, age, lifeYear, lossCoefficient, maxCapacity);
    }

    @Override
    protected int work(Product product) {
        if (breakDown) {
            System.out.println("This machine can't work due to a malfunction, please fix!\n");
            return 0;
        }
        Random rand = new Random();
        int failPossibility = rand.nextInt(8);
        if (failPossibility < 2) malfunction();
        if (!breakDown) {
            Random rand2 = new Random();
            int bounds = (int) (aimProcessNum * 0.02);
            int trashNum = rand2.nextInt(bounds);
            // TODO 返回的值是成功产出产品数
            process(product, aimProcessNum - trashNum);
            increaseAge();
            return aimProcessNum - trashNum;
        } else {
            System.out.println("This machine can't work due to a malfunction, please fix!\n");
            return 0;
        }
    }

    /**
     * detailed woring process
     *
     * @param product    a Product
     * @param productNum a int
     */
    public abstract void process(Product product, int productNum);

    public String toString() {
        return "class ProcessMachine";
    }
}
