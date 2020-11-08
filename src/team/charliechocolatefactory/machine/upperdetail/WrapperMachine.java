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
    public WrapperMachine(String type, String machineNum)
    {
        super(type,machineNum);
    }

    public WrapperMachine(String type,String machineNum,double age)
    {
        super(type,machineNum,age);
    }

    @Override
    public int work(Product product, int productNum) {
        return 0;
    }
}
