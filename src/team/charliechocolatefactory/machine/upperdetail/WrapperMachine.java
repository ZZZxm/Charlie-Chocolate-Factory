package team.charliechocolatefactory.machine.upperdetail;

import team.charliechocolatefactory.machine.functiondetail.ProcessMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname WrapperMachine
 * @description TODO
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
    protected void process(String productName, int productNum) {
        包装操作
        return;
    }
}
