package test.DesignPatternTest;

import team.charliechocolatefactory.factory.support.WorkerAddingController;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.utilityworker.Cleaner;
import team.charliechocolatefactory.person.staff.worker.utilityworker.MaintenanceWorker;
import team.charliechocolatefactory.scene.SceneStructure;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

import java.util.Scanner;

/**
 * @author Y.C.Young, Zeus Lee
 * @project chocolateFactory
 * @classname VisitorTest
 * @description
 *  Visitor pattern is a behavioral design pattern,
 *
 *  in which different utility workers are introduced in different scenarios to achieve different processing results.
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
                    // Initialize specific operations on the scene.
                    Cleaner cleaner = new Cleaner("Tom",18, Person.Sex.MALE,5000,new Office());
                    // Initialize scene launcher
                    SceneStructure structure = new SceneStructure();
                    structure.addScene(new Office());
                    structure.addScene(new DiningRoom());
                    structure.addScene(new Warehouse());
                    structure.accept(cleaner);
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("Visitor Pattern Test: Test the treatment method of MaintenanceWorker (MaintenanceWorker)：");
                    // Initialize specific operations on the scene.
                    MaintenanceWorker maintenanceWorker = new MaintenanceWorker("Tom",18, Person.Sex.MALE,5000,new Office());
                    // Initialize scene launcher
                    SceneStructure structure2 = new SceneStructure();
                    structure2.addScene(new Office());
                    structure2.addScene(new DiningRoom());
                    structure2.addScene(new Warehouse());
                    structure2.accept(maintenanceWorker);
                    System.out.println("");
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}