package test.DesignPatternTest;

import team.charliechocolatefactory.factory.support.WorkerAddingController;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

import java.util.Scanner;

/**
 * @author Y.C.Young, Zeus Lee
 * @project chocolateFactory
 * @classname IOCPatternTest
 * @description
 * By passing different staffareas, we create different workers in our workeraddingcontroller
 * and inject them into our staffarea class to realize our IOC (dependency flipping) function
 * @date 2020/11/22 22:07
 */
public class IOCTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [IOCPatternTest patter] Test ------------------------------------");

        System.out.println("");
        System.out.println("WorkerAddingController : addWorkerToScene(): void : " +
                "By passing different staffareas, our work is generated internally and then returned.\n" +
                "\n");
        System.out.println("");

        System.out.println("");
        System.out.println("******************* (Immutable patter) Test *******************");
        System.out.println("***                 1. init Office                                  ***");
        System.out.println("***                 2. init DiningRoom                              ***");
        System.out.println("***                 3. init Warehouse                               ***");
        System.out.println("***                                                                 ***");
        System.out.println("***You can select different scenarios, and the workers in the scene will be filled automatically***");
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
                    System.out.println("IOC Pattern: creating office Walker will implicitly create office worker：");
                    Office office = new Office();
                    WorkerAddingController.addWorkerToScene("Tom",18, Person.Sex.MALE,5000,office);
                    System.out.println(office);
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("IOC Pattern: creating office DiningRoom will implicitly create DinningRoomWorker：");
                    DiningRoom diningRoom = new DiningRoom();
                    WorkerAddingController.addWorkerToScene("lisa",20, Person.Sex.MALE,6000,diningRoom);
                    System.out.println(diningRoom);
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("IOC Pattern: creating warehouse Walker will implicitly create WarehouseWorker：");
                    Warehouse warehouse = new Warehouse();
                    WorkerAddingController.addWorkerToScene("mark",22, Person.Sex.FEMALE,7000,warehouse);
                    System.out.println(warehouse);
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