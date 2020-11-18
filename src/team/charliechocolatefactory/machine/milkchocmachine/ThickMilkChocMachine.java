package team.charliechocolatefactory.machine.milkchocmachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ThickMilkChocMachine
 * @description This machine produces milk chocolate with CocoaBean=1500, Sugar=20, Milk=5.
 * @date 2020/11/14 18:04
 */
public class ThickMilkChocMachine extends MilkChocMachine{
    public ThickMilkChocMachine()
    {
        this.setMachineNum("002");
    }

    @Override
    public void useCocoaBean() {
        milkChocolate.setCocoaBeanNum(150.0);
        System.out.println("Use cocoaBeanNum = 150.0\n");
    }

    @Override
    public void useSugar() {
        milkChocolate.setSugarNum(20.0);
        System.out.println("Use sugarNum = 20.0\n");
    }

    @Override
    public void useMilk() {
        milkChocolate.setMilkNum(5.0);
        System.out.println("Use milkNum = 5.0\n");
    }

    public String toString() {
        return "class ThickMilkChocMachine extends MilkChocMachine";
    }
}
