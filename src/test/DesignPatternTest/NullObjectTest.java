package test.DesignPatternTest;

import team.charliechocolatefactory.factory.support.WorkerAddingController;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.Staff;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseClient;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

import javax.naming.Name;
import java.util.Scanner;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname NullObjectTest
 * @description Test for null object pattern
 * @date 2020/11/24 18:19
 */
public class NullObjectTest {

    public static void main(String[] args) {


        System.out.println("------------------------------------ Null Object Test ------------------------------------");

        System.out.println("");
        System.out.println("EmptyStaff : display(): void : show there is no such object");
        System.out.println("");

        System.out.println("");
        System.out.println("************************** Null Object Test ***************************");
        System.out.println("***                                                                 ***");
        System.out.println("***        There are 5 Staff object with ID created randomly.       ***");
        System.out.println("***        You can input the ID to find the staff                   ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Manager manager = Manager.getWarehouseManager();

        Warehouse warehouse = new Warehouse();


        WorkerAddingController.addWorkerToScene("Kerr", 1, Person.Sex.FEMALE, 1, warehouse);
        WorkerAddingController.addWorkerToScene("TT", 21, Person.Sex.MALE, 10, warehouse);
        WorkerAddingController.addWorkerToScene("Yuan", 22, Person.Sex.FEMALE, 10000, warehouse);
        WorkerAddingController.addWorkerToScene("Muller", 31, Person.Sex.MALE, 2513, warehouse);

        System.out.println("\nSome staffs were added to the warehouse and here is their information: ");

        warehouse.displayAllStaffs();

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("\nNow input the ID you're gonna search [0 to quit]:");
            String myId = input.nextLine();
            if (myId.equals("0")) {
                flag = false;
            }
            System.out.println("\nHere is the searching result:");
            warehouse.searchStaffById(myId);
        }

    }

}
