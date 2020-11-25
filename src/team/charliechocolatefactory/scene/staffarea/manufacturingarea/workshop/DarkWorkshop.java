package team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.product.chocolate.DarkChocolate;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCookie;
import team.charliechocolatefactory.scene.SceneNameConst;

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
    public void produceChocolate() {
        int outNum = productMachine.run(new DarkChocolate());
        if (outNum == 0) {
            System.out.println("Failing producing DarkChocolate!");
        } else {
            System.out.println("Successfully producing " + outNum + " DarkChocolate!\n");
        }
    }

    @Override
    public void produceChocolateCookie() {
        int outNum = productMachine.run(new ChocolateCookie(ChocolateCookie.Shape.CAT));
        if (outNum == 0) {
            System.out.println("Failing producing ChocolateCookie in the shape of cat!");
        } else {
            System.out.println("Successfully producing " + outNum + " ChocolateCookie in the shape of cat!\n");
        }
    }

    @Override
    public String toString() {
        return SceneNameConst.DARK_WORKSHOP;
    }
}
