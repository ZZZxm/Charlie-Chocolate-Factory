package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname SingletonTest
 * @description Test for Singleton
 * @date 2020/11/19 1:28
 */
public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Singleton] Test ------------------------------------");

        System.out.println("");
        System.out.println("GeneralManager : getInstance() : Get the only instance of the general manager " +
                "and create an instance if there's none.");
        System.out.println("");

        System.out.println("");
        System.out.println("**************************** Singleton Test ***************************");
        System.out.println("***                 1. Get instance of general manager              ***");
        System.out.println("***                 2. Test whether it is singleton                 ***");
        System.out.println("***                                                                 ***");
        System.out.println("***Tips: Please execute order 1 first                               ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        GeneralManager generalManager1 = null, generalManager2 = null;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            if (generalManager1 == null && op > 1) {
                System.out.println("Please input order 1 first!");
                continue;
            }

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let's get an instance of general manager for the first time: ");
                    generalManager1 = GeneralManager.getInstance();
                    System.out.println("");
                    System.out.println("Get an instance of general manager again: ");
                    generalManager2 = GeneralManager.getInstance();
                    break;
                }
                case 2: {
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"generalManager1 == generalManager2 \", which should be true.");
                    System.out.println(generalManager1 == generalManager2);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}
