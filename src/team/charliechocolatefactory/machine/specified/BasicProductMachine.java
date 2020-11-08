package team.charliechocolatefactory.machine.specified;

import team.charliechocolatefactory.machine.upperdetail.ProductMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BasicProductMachine
 * @description TODO
 * @date 2020/11/9 0:09
 */
public class BasicProductMachine extends ProductMachine {
    public BasicProductMachine(String type, String machineNum)
    {
        super(type,machineNum,40,1,500);
    }

    public BasicProductMachine(String type,String machineNum,double age)
    {
        super(type,machineNum,age,40,1,500);
    }
}
