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

    public ProcessMachine(String type,String machineNum,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,lifeYear,lossCoefficient,maxCapacity);
    }

    public ProcessMachine(String type,String machineNum,double age,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        super(type,machineNum,age,lifeYear,lossCoefficient,maxCapacity);
    }

    @Override
    public int work(String productName) {
        if(breakDown)
        {
            System.out.println("This machine breaks down, please fix!");
            return 0;
        }
        Random rand = new Random();
        int failPosibility = rand.nextInt(8);
        if(failPosibility<2) malfunction();
        if(!breakDown) {
            Random rand2 = new Random();
            int bounds = (int) (aimProcessNum * 0.02);
            int trashNum = rand2.nextInt(bounds);
            获取trashproduct的单例对象，对其总数增加
            process(productName, aimProcessNum - trashNum);
            increaseAge();
        }
        else
        {
            System.out.println("This machine breaks down, please fix!");
            return 0;
        }
    }

    protected abstract void process(String productName,int productNum);
}
