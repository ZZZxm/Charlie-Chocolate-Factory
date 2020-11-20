package team.charliechocolatefactory.machine.processmachine.wrappermachine;

import team.charliechocolatefactory.machine.processmachine.ProcessMachine;
import team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy.WrapStrategy;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname WrapperMachine
 * @description Inherited from ProcessMachine, this class is the abstract class of all the wrapper machines.
 * @date 2020/11/8 19:30
 */
public class WrapperMachine extends ProcessMachine {

    // wrapping strategy
    private WrapStrategy strategy;

    public WrapperMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }

    public WrapperMachine(String type, String machineNum, double age, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, age, lifeYear, lossCoefficient, maxCapacity);
    }

    /**
     * process: wrap a product with a special strategy
     *
     * @param product    a Product
     * @param productNum number of a product
     */
    @Override
    public void process(Product product, int productNum) {
        strategy.packaging(product);
    }

    /**
     * set the wrap strategy of the machine
     *
     * @param strategy wrap strategy
     */
    public void setStrategy(WrapStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * @return wrap strategy of the machine
     */
    public WrapStrategy getStrategy() {
        return strategy;
    }

    public String toString() {
        return "class WrapperMachine";
    }
}
