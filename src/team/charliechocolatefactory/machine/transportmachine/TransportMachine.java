package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.Machine;
import team.charliechocolatefactory.product.Product;

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
    public int work(Product product) {
        运输操作
        return 0;
    }

    public int work()
    {
        无指定产品运输操作
        return 0;
    }
}
