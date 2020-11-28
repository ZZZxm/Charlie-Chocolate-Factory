package team.charliechocolatefactory.machine.processmachine.qualitytestmachine;

import team.charliechocolatefactory.machine.processmachine.ProcessMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @author TT
 * @project chocolateFactory
 * @classname QualityTestMachine
 * @description This is quality test machine
 * @date 2020/11/14 17:58
 */
public class QualityTestMachine extends ProcessMachine {


    public QualityTestMachine(String type)
    {
        super(type);
    }
    /**
     * Represent the quality test machine
     */
    public QualityTestMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }


    @Override
    public void process(Product product, int productNum) {
        product.packaging();
    }

    public String toString() {
        return "class QualityTestMachine";
    }
}
