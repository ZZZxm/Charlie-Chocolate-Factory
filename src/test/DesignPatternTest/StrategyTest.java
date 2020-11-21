package test.DesignPatternTest;

import team.charliechocolatefactory.machine.processmachine.wrappermachine.WrapperMachine;
import team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy.BagWrapStrategy;
import team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy.BoxWrapStrategy;
import team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy.CupWrapStrategy;
import team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy.WrapStrategy;
import team.charliechocolatefactory.product.chocolate.Chocolate;
import team.charliechocolatefactory.product.chocolate.DarkChocolate;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCake;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCookie;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateIceCream;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname StrategyTest
 * @description Test for Strategy
 * @date 2020/11/20 21:36
 */
public class StrategyTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Strategy] Test ------------------------------------");

        System.out.println("");
        System.out.println("WrapStrategy : packaging(product: Product) : each kind of wrap strategy must implement this" +
                "method, which executes specific operation of wrapping.");
        System.out.println("WrapperMachine : process(product: Product) : perform the packing operation of the packing machine");
        System.out.println("WrapperMachine : setStrategy(strategy: Strategy) : set the wrapping strategy");
        System.out.println("WrapperMachine : getStrategy() : get the wrapping strategy");
        System.out.println("");

        System.out.println("Create a wrapper machine...");
        WrapperMachine wrapperMachine1 = new WrapperMachine("WP", "101", 5.0, 0.1, 50);


        System.out.println("\nUse a box to wrap the chocolate cake.");
        ChocolateCake chocolateCake = new ChocolateCake(1);
        wrapperMachine1.setStrategy(new BoxWrapStrategy());
        wrapperMachine1.process(chocolateCake, 1);

        System.out.println("\nUse a bag to wrap the chocolate cookie.");
        ChocolateCookie chocolateCookie = new ChocolateCookie(ChocolateCookie.Shape.CAT);
        wrapperMachine1.setStrategy(new BagWrapStrategy());
        wrapperMachine1.process(chocolateCookie, 1);

        System.out.println("\nUse a cup to wrap the chocolate ice-cream.");
        ChocolateIceCream chocolateIceCream = new ChocolateIceCream();
        wrapperMachine1.setStrategy(new CupWrapStrategy());
        wrapperMachine1.process(chocolateIceCream, 1);

        System.out.println("\nIf use a wrapper machine without setting its strategy...");
        WrapperMachine wrapperMachine2 = new WrapperMachine("WP", "102", 5.0, 0.1, 50);
        DarkChocolate darkChocolate = new DarkChocolate();
        wrapperMachine2.process(darkChocolate, 1);
    }
}
