package team.charliechocolatefactory.machine.processmachine.productmachine;

import team.charliechocolatefactory.machine.processmachine.ProcessMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ProductMachine
 * @description Inherited from ProcessMachine, this class is the abstract class of all the product machines.
 * @date 2020/11/8 19:25
 */
public abstract class ProductMachine extends ProcessMachine {
    public ProductMachine(String type,String machineNum,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,lifeYear,lossCoefficient,maxCapacity);
    }

    public ProductMachine(String type,String machineNum,double age,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,age,lifeYear,lossCoefficient,maxCapacity);
    }

    @Override
    public void process(Product product, int productNum) {
//        System.out.println("Start producing "+product.getName()+"...");
//        System.out.println("Finish producing "+product.getName()+".");
//        product.gotoNextState();
        return;
    }

    public String toString() {
        return "class ProductMachine";
    }
}
