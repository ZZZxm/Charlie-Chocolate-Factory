package test.DesignPatternTest;
import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.WhiteWorkshop;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.Workshop;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname AbstractFactoryTest
 * @description Test for Design Pattern --- Abstract Factory
 * @date 2020/11/24 0:04
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Abstract Factory] Test ------------------------------------");
        System.out.println("");
        System.out.println("Workshop : produceChocolate() : Let the specific workshop produce specific chocolate");
        System.out.println("Workshop : produceChocolateCookie() : Let the specific workshop produce specific chocolate products");
        System.out.println("");

        System.out.println("Create a new workshop producing white chocolate products...");
        Workshop whiteWorkshop = new WhiteWorkshop();
        System.out.println("Create a new workshop producing dark chocolate products...");
        Workshop darkWorkshop = new DarkWorkshop();

        System.out.println("");
        System.out.println("********************** TIPS **********************");
        System.out.println("***      1. Input 1 to start testing           ***");
        System.out.println("***      2. Input 2 to fix machines            ***");
        System.out.println("***      3. Input 3 to create new machines     ***");
        System.out.println("***      4. Input 0 to exit                    ***");
        System.out.println("**************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the command [0 to quit]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let whiteWorkshop start producing chocolate...");
                    whiteWorkshop.produceChocolate();
                    System.out.println("Let whiteWorkshop start producing chocolate products...");
                    whiteWorkshop.produceChocolateCookie();
                    System.out.println("Let darkWorkshop start producing chocolate...");
                    darkWorkshop.produceChocolate();
                    System.out.println("Let darkWorkshop start producing chocolate products...");
                    darkWorkshop.produceChocolateCookie();
                    break;
                }
                case 2: {
                    whiteWorkshop.productMachine.fix();
                    darkWorkshop.productMachine.fix();
                    break;
                }
                case 3: {
                    Random rand = new Random();
                    int num = rand.nextInt(1000);
                    String number=String.valueOf(num);
                    whiteWorkshop.productMachine=new BasicProductMachine("PR", number);
                    String name = whiteWorkshop.productMachine.getMachineID();
                    System.out.println("In the WhiteWorkshop, machine " + name + " has been set to produce.\n");
                    whiteWorkshop.productMachine.setAimProcessNum(250);

                    num = rand.nextInt(1000);
                    number=String.valueOf(num);
                    darkWorkshop.productMachine=new BasicProductMachine("PR", number);
                    name = darkWorkshop.productMachine.getMachineID();
                    System.out.println("In the DarkWorkshop, machine " + name + " has been set to produce.\n");
                    darkWorkshop.productMachine.setAimProcessNum(250);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
