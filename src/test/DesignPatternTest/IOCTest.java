package test.DesignPatternTest;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.WhiteWorkshop;

import java.util.Scanner;

/**
 * @author Y.C.Young, Zeus Lee
 * @project chocolateFactory
 * @classname IOCPatternTest
 * @description By passing different staffareas, we create different workers in our workeraddingcontroller
 * and inject them into our staffarea class to realize our IOC (dependency flipping) function
 * @date 2020/11/22 22:07
 */
public class IOCTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [IOC] Test ------------------------------------");

        System.out.println("");
        System.out.println("WorkerAddingController : addWorkerToScene(): void : " +
                "By passing different staffareas, our work is generated internally and then returned.\n" +
                "\n");
        System.out.println("");

        System.out.println("");
        System.out.println("****************************** IOC Test *******************************");
        System.out.println("***                         1. Init Office                          ***");
        System.out.println("***                         2. Init DiningRoom                      ***");
        System.out.println("***                         3. Init Warehouse                       ***");
        System.out.println("***                         4. Init DarkWorkshop                    ***");
        System.out.println("***                         5. Init WhiteWorkshop                   ***");
        System.out.println("***                                                                 ***");
        System.out.println("***                                                                 ***");
        System.out.println("***You can select different scenarios, and the workers in the       ***");
        System.out.println("***scene will be filled automatically                               ***");
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
                    Manager.getOfficeManager().hireWorker("Tom",  Person.Sex.MALE, 18, 5000, office);
                    office.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("IOC Pattern: creating office DiningRoom will implicitly create DinningRoomWorker：");
                    DiningRoom diningRoom = new DiningRoom();
                    Manager.getDiningRoomManager().hireWorker("Lisa", Person.Sex.FEMALE, 20, 6000, diningRoom);
                    diningRoom.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("IOC Pattern: creating warehouse Walker will implicitly create WarehouseWorker：");
                    Warehouse warehouse = new Warehouse();
                    Manager.getWarehouseManager().hireWorker("mark",  Person.Sex.FEMALE, 22, 7000, warehouse);
                    warehouse.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("IOC Pattern: creating DarkWorkshop Walker will implicitly create DarkWorkshopWorker：");
                    DarkWorkshop darkWorkshop = new DarkWorkshop();
                    Manager.getWorkShopManager().hireWorker("mark",  Person.Sex.MALE, 22, 7000, darkWorkshop);
                    darkWorkshop.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 5: {
                    System.out.println("IOC Pattern: creating WhiteWorkshop Walker will implicitly create WhiteWorkshopWorker：");
                    WhiteWorkshop whiteWorkshop = new WhiteWorkshop();
                    Manager.getWorkShopManager().hireWorker("mark", Person.Sex.FEMALE, 22,  7000, whiteWorkshop);
                    whiteWorkshop.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}