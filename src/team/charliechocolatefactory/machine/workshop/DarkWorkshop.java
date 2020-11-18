package team.charliechocolatefactory.machine.workshop;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.product.chocolate.DarkChocolate;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCookie;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BlackWorkshop
 * @description This workshop produces dark chocolate and cat shaped cookies.
 * @date 2020/11/14 1:05
 */
public class DarkWorkshop extends Workshop {
    public DarkWorkshop() {
        super();
        productMachine = new BasicProductMachine("PR", "0324");
        String name = productMachine.getMachineID();
        System.out.println("In the DarkWorkshop, machine " + name + " has been set to produce.\n");
        productMachine.setAimProcessNum(250);
    }

    @Override
    public int produceChocolate() {
        int outNum = productMachine.run(new DarkChocolate());
        if (outNum == 0) {
            System.out.println("Failing producing DarkChocolate!");
        } else {
            System.out.println("Successfully producing " + outNum + " DarkChocolate!");
        }
        return outNum;
    }

    @Override
    public int produceChocolateCookie() {
        int outNum = productMachine.run(new ChocolateCookie(ChocolateCookie.Shape.CAT));
        if (outNum == 0) {
            System.out.println("Failing producing ChocolateCookie in the shape of cat!");
        } else {
            System.out.println("Successfully producing " + outNum + " ChocolateCookie in the shape of cat!");
        }
        return outNum;
    }

    public String toString() {
        return "class DarkWorkshop extends Workshop";
    }
}
