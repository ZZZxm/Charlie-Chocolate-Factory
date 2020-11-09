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
    public int work(Product product, int productNum) {
        return 0;
    }

    /**
     * universal working process of all the transportMachines
     * @param product a Product
     * @return a int
     */
    public int transport(Product product)
    {
        work(product,aimProcessNum);
        return aimProcessNum;
    }
}
