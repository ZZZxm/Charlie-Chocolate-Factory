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
    public ProductMachine(String type, String machineNum)
    {
        super(type,machineNum);
    }

    public ProductMachine(String type,String machineNum,double age)
    {
        super(type,machineNum,age);
    }

    @Override
    public int work(Product product, int productNum) {
        return 0;
    }
}
