package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;

import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MultitonTest
 * @description MultitonTest
 * @date 2020/11/22 15:49
 */
public class MultitonTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Multiton] Test ------------------------------------");

        System.out.println("");
        System.out.println("Manager : getDiningRoomManager() : Get dining room's manager which is single.");
        System.out.println("Manager : getOfficeManager() : Get office's manager which is single.");
        System.out.println("Manager : getWorkShopManager() : Get workshop's manager which is single.");
        System.out.println("Manager : getWareHouseManager() : Get warehouse's manager which is single.");
        System.out.println("");

        System.out.println("");
        System.out.println("********************************* Multiton Test ************************************");
        System.out.println("***                 1. get instance of dining room's manager                     ***");
        System.out.println("***                 2. get instance of office's manager                          ***");
        System.out.println("***                 3. get instance of workshop's manager                        ***");
        System.out.println("***                 4. get instance of warehouse's manager                       ***");
        System.out.println("************************************************************************************");
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
                    System.out.println("Let's get an instance of dining room's manager for the first time: ");
                    Manager diningRoomManager1 = Manager.getDiningRoomManager();
                    System.out.println("");
                    System.out.println("Get an instance of dining room's manager manager again: ");
                    Manager diningRoomManager2 = Manager.getDiningRoomManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"diningRoomManager1 == diningRoomManager2 \", which should be true.");
                    System.out.println(diningRoomManager1 == diningRoomManager2);
                    break;
                }
                case 2: {
                    System.out.println("Let's get an instance of office's manager for the first time: ");
                    Manager officeManager1 = Manager.getOfficeManager();
                    System.out.println("");
                    System.out.println("Get an instance of office's manager again: ");
                    Manager officeManager2 = Manager.getOfficeManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"officeManager1 == officeManager2 \", which should be true.");
                    System.out.println(officeManager1 == officeManager2);
                    break;

                }
                case 3: {
                    System.out.println("Let's get an instance of workshop's manager for the first time: ");
                    Manager workshopManager1 = Manager.getWorkShopManager();
                    System.out.println("");
                    System.out.println("Get an instance of workshop's manager again: ");
                    Manager workshopManager2 = Manager.getWorkShopManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"workshopManager1 == workshopManager2 \", which should be true.");
                    System.out.println(workshopManager1 == workshopManager2);
                    break;
                }
                case 4: {
                    System.out.println("Let's get an instance of warehouse's manager for the first time: ");
                    Manager warehouseManager1 = Manager.getWarehouseManager();
                    System.out.println("");
                    System.out.println("Get an instance of warehouse's manager again: ");
                    Manager warehouseManager2 = Manager.getWarehouseManager();
                    System.out.println("Let's check whether the two instances are the same:");
                    System.out.println("Print the result of \"warehouseManager1 == warehouseManager2 \", which should be true.");
                    System.out.println(warehouseManager1 == warehouseManager2);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
