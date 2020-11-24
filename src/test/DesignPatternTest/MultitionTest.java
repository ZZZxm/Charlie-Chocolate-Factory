package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MultitionTest
 * @description MultitionTest
 * @date 2020/11/22 15:49
 */
public class MultitionTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Multition] Test ------------------------------------");

        System.out.println("");
        System.out.println("Manager : getDiningRoomManager() : Get dining room's manager which is single.");
        System.out.println("Manager : getOfficeManager() : Get office's manager which is single.");
        System.out.println("Manager : getWorkShopManager() : Get workshop's manager which is single.");
        System.out.println("Manager : getWareHouseManager() : Get warehouse's manager which is single.");
        System.out.println("");

        System.out.println("\nGet instance of dining room's manager: ");
        Manager diningRoomManager = Manager.getOfficeManager();

        System.out.println("\nGet instance of office's manager: ");
        Manager officeManager = Manager.getOfficeManager();

        System.out.println("\nGet instance of workshop's manager: ");
        Manager workshopManager = Manager.getWorkShopManager();

        System.out.println("\nGet instance of warehouse's manager: ");
        Manager warehouseManager = Manager.getWarehouseManager();

    }
}
