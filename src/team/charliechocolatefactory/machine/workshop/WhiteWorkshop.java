package team.charliechocolatefactory.machine.workshop;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.product.chocolate.WhiteChocolate;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCookie;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname WhiteWorkshop
 * @description This workshop produces white chocolate and dog shaped cookies.
 * @date 2020/11/13 18:33
 */
public class WhiteWorkshop extends Workshop {
    public WhiteWorkshop() {
        super();
        productMachine = new BasicProductMachine("PR", "1825");
        String name = productMachine.getMachineID();
        System.out.println("In the WhiteWorkshop, machine " + name + " has been set to produce.\n");
        productMachine.setAimProcessNum(250);
    }

    @Override
    public int produceChocolate() {
        int outNum = productMachine.run(new WhiteChocolate());
        if (outNum == 0) {
            System.out.println("Failing producing WhiteChocolate!");
        } else {
            System.out.println("Successfully producing " + outNum + " WhiteChocolate!");
        }
        return outNum;
    }

    @Override
    public int produceChocolateCookie() {
        int outNum = productMachine.run(new ChocolateCookie(ChocolateCookie.Shape.DOG));
        if (outNum == 0) {
            System.out.println("Failing producing ChocolateCookie in the shape of dog!");
        } else {
            System.out.println("Successfully producing " + outNum + " ChocolateCookie in the shape of dog!");
        }
        return outNum;
    }

    public String toString() {
        return "class WhiteWorkshop extends Workshop";
    }
}