package team.charliechocolatefactory.machine.specified;

import team.charliechocolatefactory.machine.functiondetail.TransportMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BigTruck
 * @description TODO
 * @date 2020/11/8 19:55
 */
public class BigTruck extends TransportMachine {
    public BigTruck(String type, String machineNum)
    {
        super(type,machineNum,10,1,400);
    }

    public BigTruck(String type,String machineNum,double age)
    {
        super(type,machineNum,age,10,1,400);
    }
}
