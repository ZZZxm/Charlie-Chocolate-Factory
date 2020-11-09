package team.charliechocolatefactory.machine.functiondetail;

import team.charliechocolatefactory.machine.Machine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname TransportMachine
 * @description TODO
 * @date 2020/11/8 14:03
 */
public abstract class TransportMachine extends Machine {

    public TransportMachine(String type,String machineNum,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,lifeYear,lossCoefficient,maxCapacity);
    }

    public TransportMachine(String type,String machineNum,double age,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,age,lifeYear,lossCoefficient,maxCapacity);
    }

    @Override
    public int work(String productName) {
        运输操作
        return 0;
    }
}
