package test.DesignPatternTest;

import team.charliechocolatefactory.factory.CharlieFactory;

import java.util.Scanner;

/**
 * @author Y.C.Young, Zeus Lee
 * @project chocolateFactory
 * @classname VisitorTest
 * @description test for visitor pattern
 * @date 2020/11/22 22:07
 */
public class VisitorTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Visitor] Test ------------------------------------");

        System.out.println("");
        System.out.println("SceneStructure : addScene(): void : " +
                "Add scenarios to our processing class.");
        System.out.println("SceneStructure : accept(UtilityWorker worker): void : " +
                "In different scenarios, different utility worker classes are executed to separate the specific scene from the scene operation.");
        System.out.println("");

        System.out.println("");
        System.out.println("*********************** Immutable patter Test *************************");
        System.out.println("***                 1. test cleaner                                 ***");
        System.out.println("***                 2. test maintenanceWorker                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***You can choose to specify behavior for our existing scene classes***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Visitor Pattern Test: Test the treatment method of Cleaner (Cleaner)：");
                    CharlieFactory.getCharlieFactory().doClean();
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("Visitor Pattern Test: Test the treatment method of MaintenanceWorker (MaintenanceWorker)：");
                    CharlieFactory.getCharlieFactory().doMaintenance();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}