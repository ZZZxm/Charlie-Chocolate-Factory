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

    public void process(Product product)
    {
        if(breakDown)
        {
            System.out.println("This machine breaks down, please fix!");
            return;
        }
        Random rand = new Random();
        int failPosibility = rand.nextInt(8);
        if(failPosibility<2) malfunction();
        if(!breakDown) {
            Random rand = new Random();
            int bounds = (int) (aimProcessNum * 0.02);
            int trashNum = rand.nextInt(bounds);
            获取trashproduct的单例对象，对其总数增加
            work(product, aimProcessNum - trashNum);
            increaseAge();
        }
        else
        {
            System.out.println("This machine breaks down, please fix!");
        }
    }
}
