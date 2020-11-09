package team.charliechocolatefactory.machine.upperdetail;

import team.charliechocolatefactory.machine.functiondetail.ProcessMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ProductMachine
 * @description TODO
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
    protected void process(String productName, int productNum) {
        生产操作
        return;
    }
}
