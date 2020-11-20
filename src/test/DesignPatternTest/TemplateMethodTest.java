package test.DesignPatternTest;

import team.charliechocolatefactory.machine.transportmachine.BigTruck;
import team.charliechocolatefactory.machine.transportmachine.SmallCar;
import team.charliechocolatefactory.machine.transportmachine.Van;
import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.product.chocolate.Chocolate;
import team.charliechocolatefactory.product.chocolateProduct.ChocolateCake;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname TemplateMethodTest
 * @description Test for Template Method
 * @date 2020/11/20 21:06
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Template Method] Test ------------------------------------");

        System.out.println("");
        System.out.println("TransportMachine : work(product: Product) : execute work of transporting, include loading," +
                " transporting and arriving.");
        System.out.println("TransportMachine : load(product: Product) : first step of work, loading a product.");
        System.out.println("TransportMachine : arrive(product: Product) : last step of work, loading a product.");
        System.out.println("");


        System.out.println("Now we want to transport 50 chocolate cakes.");
        ChocolateCake cakes = new ChocolateCake(1);

        System.out.println("\nUse a big truck to transport them.");
        BigTruck bigTruck = new BigTruck("TR", "101");
        bigTruck.setAimProcessNum(50);
        bigTruck.work(cakes);

        System.out.println("\nUse a van to transport them.");
        Van van = new Van("TR", "102");
        van.setAimProcessNum(50);
        van.work(cakes);

        System.out.println("\nUse a small car to transport them.");
        SmallCar smallCar = new SmallCar("TR", "103");
        smallCar.work(cakes);

        System.out.println("\nIt seems that small car can only take people. Let's try again!");
        smallCar.work(null);
    }
}
