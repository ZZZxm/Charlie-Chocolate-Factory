package team.charliechocolatefactory.machine.processmachine.productmachine.milkchocmachine;

import team.charliechocolatefactory.product.chocolate.MilkChocolate;
import team.charliechocolatefactory.machine.processmachine.productmachine.milkchocmachine.MilkChocMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname MilkChocController
 * @description This machine controls the production process of milkChocMachine.
 * @date 2020/11/14 18:07
 */
public class MilkChocController {
    public MilkChocMachine milkChocMachine;

    public MilkChocController(MilkChocMachine milkChocMachine) {
        this.milkChocMachine = milkChocMachine;
        String name = milkChocMachine.getMachineID();
        System.out.println(name + " has been set to produce.\n");
        milkChocMachine.setAimProcessNum(100);
    }

    /**
     * first determine the amount of each part of the raw materials, and then execute the production
     *
     * @return a int representing output
     */
    public int startProduce() {
        milkChocMachine.useCocoaBean();
        milkChocMachine.useSugar();
        milkChocMachine.useMilk();
        int outNum = milkChocMachine.run(milkChocMachine.getMilkChocolate());
        if (outNum == 0) {
            System.out.println("Failing producing MilkChocolate!");
        } else {
            // System.out.println("Successfully producing " + outNum + " MilkChocolate!");
        }
        return outNum;
    }

    /**
     * return the product
     *
     * @return a MilkChocolate
     */
    public MilkChocolate getMilkChocolate() {
        return milkChocMachine.getMilkChocolate();
    }

    public String toString() {
        return "class MilkChocController";
    }
}
