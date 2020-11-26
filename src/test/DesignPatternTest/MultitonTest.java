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
        System.out.println("***************************** Multiton Test ***************************");
        System.out.println("***                 1. get instance of dining room's manager        ***");
        System.out.println("***                 2. get instance of office's manager             ***");
        System.out.println("***                 3. get instance of workshop's manager           ***");
        System.out.println("***                 4. get instance of warehouse's manager          ***");
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
                    Manager diningRoomManager = Manager.getDiningRoomManager();
                    break;
                }
                case 2: {
                    Manager officeManager = Manager.getOfficeManager();
                    break;
                }
                case 3: {
                    Manager workshopManager = Manager.getWorkShopManager();
                    break;
                }
                case 4: {
                    Manager warehouseManager = Manager.getWarehouseManager();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
