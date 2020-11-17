package team.charliechocolatefactory.machine.processmachine.wrappermachine;

import team.charliechocolatefactory.machine.processmachine.ProcessMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname WrapperMachine
 * @description Inherited from ProcessMachine, this class is the abstract class of all the wrapper machines.
 * @date 2020/11/8 19:30
 */
public class WrapperMachine extends ProcessMachine {
    public WrapperMachine(String type,String machineNum,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,lifeYear,lossCoefficient,maxCapacity);
    }

    public WrapperMachine(String type,String machineNum,double age,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,age,lifeYear,lossCoefficient,maxCapacity);
    }

    @Override
    protected void process(Product product, int productNum) {
        product.packaging();
        return;
    }

    public String toString() {
        return "class WrapperMachine";
    }
}
