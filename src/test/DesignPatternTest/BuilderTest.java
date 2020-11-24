package test.DesignPatternTest;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.machine.processmachine.productmachine.milkchocmachine.MilkChocController;
import team.charliechocolatefactory.machine.processmachine.productmachine.milkchocmachine.NormalMilkChocMachine;
import team.charliechocolatefactory.machine.processmachine.productmachine.milkchocmachine.ThickMilkChocMachine;

import java.util.Random;
import java.util.Scanner;


/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BuilderTest
 * @description Test for Design Pattern --- Builder
 * @date 2020/11/24 0:37
 */
public class BuilderTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Builder] Test ------------------------------------");
        System.out.println("");
        System.out.println("MilkChocController : startProduce() : Let the specific MilkChocMachine produce milk chocolate with a specific composition");
        System.out.println("MilkChocController : getMilkChocolate() : Get the milk chocolate produced");
        System.out.println("");

        System.out.println("Create a new MilkChocMachine producing milk chocolate in normal flavor and give control of it to a controller...");
        MilkChocController normalMilkChocController=new MilkChocController(new NormalMilkChocMachine());
        System.out.println("Create a new MilkChocMachine producing milk chocolate in thick flavor and give control of it to a controller...");
        MilkChocController thickMilkChocController=new MilkChocController(new ThickMilkChocMachine());

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
                    System.out.println("Let normalMilkChocMachine start producing...");
                    normalMilkChocController.startProduce();
                    System.out.println("Let thickMilkChocMachine start producing...");
                    thickMilkChocController.startProduce();
                    break;
                }
                case 2: {
                    normalMilkChocController.milkChocMachine.fix();
                    thickMilkChocController.milkChocMachine.fix();
                    break;
                }
                case 3: {
                    Random rand = new Random();
                    int num = rand.nextInt(1000);
                    String number=String.valueOf(num);
                    normalMilkChocController.milkChocMachine=new NormalMilkChocMachine(number);
                    String name = normalMilkChocController.milkChocMachine.getMachineID();
                    System.out.println("Of the normalMilkChocController, machine " + name + " has been set to produce.\n");
                    normalMilkChocController.milkChocMachine.setAimProcessNum(100);

                    num = rand.nextInt(1000);
                    number=String.valueOf(num);
                    thickMilkChocController.milkChocMachine=new ThickMilkChocMachine(number);
                    name =  thickMilkChocController.milkChocMachine.getMachineID();
                    System.out.println("Of the thickMilkChocController, machine " + name + " has been set to produce.\n");
                    thickMilkChocController.milkChocMachine.setAimProcessNum(100);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
