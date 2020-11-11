package team.charliechocolatefactory.machine.transportmachine;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname CommercialVehicle
 * @description Machine for transporting a medium quantity of items.
 * @date 2020/11/8 19:54
 */
public class Van extends TransportMachine {
    public Van(String type, String machineNum)
    {
        super(type,machineNum,15,0.8,150);
    }

    public Van(String type, String machineNum, double age)
    {
        super(type,machineNum,age,15,0.8,150);
    }

    public String toString() {
        return "class Van";
    }
}
