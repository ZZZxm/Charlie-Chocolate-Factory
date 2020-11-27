package team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.product.chocolate.WhiteChocolate;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCookie;
import team.charliechocolatefactory.scene.SceneNameConst;

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

    public WhiteWorkshop(String location, double cost, double area) {
        super(location, cost, area);
        productMachine = new BasicProductMachine("PR", "1825");
        productMachine.setAimProcessNum(250);
    }

    public WhiteWorkshop(String location, double cost, double area, String machineType, String machineNum, int aimProcess) {
        super(location, cost, area);
        productMachine = new BasicProductMachine(machineType, machineNum);
        productMachine.setAimProcessNum(aimProcess);
    }

    @Override
    public void produceChocolate() {
        int outNum = productMachine.run(new WhiteChocolate());
        if (outNum == 0) {
            System.out.println("Failing producing WhiteChocolate!\n");
        } else {
            System.out.println("Successfully producing " + outNum + " WhiteChocolate!\n");
        }
    }

    @Override
    public void produceChocolateCookie() {
        int outNum = productMachine.run(new ChocolateCookie(ChocolateCookie.Shape.DOG));
        if (outNum == 0) {
            System.out.println("Failing producing ChocolateCookie in the shape of dog!\n");
        } else {
            System.out.println("Successfully producing " + outNum + " ChocolateCookie in the shape of dog!\n");
        }
    }

    @Override
    public String toString() {
        return SceneNameConst.WHITE_WORKSHOP;
    }
}
