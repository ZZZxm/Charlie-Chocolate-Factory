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
    protected int capacity;
    protected int maxCapacity;

    public TransportMachine(String type, String machineNum)
    {
        super(type,machineNum);
    }

    public TransportMachine(String type,String machineNum,double age)
    {
        super(type,machineNum,age);
    }

    public void setCapacity(int capacity) {
        if(capacity> maxCapacity)
        {
            System.out.println("Exceed maxCapacity!");
            return;
        }
        if(capacity<=0)
        {
            System.out.println("Capacity must be a positive integer!");
            return;
        }
        this.capacity = capacity;
        this.agingSpeed=1+(1.0*(capacity -maxCapacity))/ maxCapacity;
    }

    @Override
    public int work(Product product, int productNum) {
        return 0;
    }

    public int transport(Product product)
    {
        work(product,capacity);
        return capacity;
    }
}
