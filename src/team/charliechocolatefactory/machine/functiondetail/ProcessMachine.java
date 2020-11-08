package team.charliechocolatefactory.machine.functiondetail;

import team.charliechocolatefactory.machine.Machine;

import java.util.Random;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ProcessMachine
 * @description TODO
 * @date 2020/11/8 0:04
 */
public abstract class ProcessMachine extends Machine {
    static final int MAXIM_NUM =500;
    //the number of products aimed to produce per production
    protected int aimProductNum;

    public ProcessMachine(String type, String machineNum)
    {
        super(type,machineNum);
        aimProductNum =0;
    }

    public ProcessMachine(String type,String machineNum,double age)
    {
        super(type,machineNum,age);
        aimProductNum =0;
    }

    public void setAimProduct(int aimProductNum)
    {
        if(aimProductNum> MAXIM_NUM)
        {
            System.out.println("Exceed maximum aimProductNum!");
            return;
        }
        if(aimProductNum<=0)
        {
            System.out.println("AimProductNum must be a positive integer!");
            return;
        }
        this.aimProductNum =aimProductNum;
        //adjust the machine aging speed according to the target production number
        this.agingSpeed=1+(1.0*(MAXIM_NUM -aimProductNum))/ MAXIM_NUM;
    }

    public void process(Product product)
    {
        Random rand = new Random();
        int bounds=(int)(aimProductNum*0.02);
        int trashNum= rand.nextInt(bounds);
        获取trashproduct的单例对象，对其总数增加
        work(product,aimProductNum-trashNum);
        increaseAge();
    }
}
