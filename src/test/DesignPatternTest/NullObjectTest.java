package test.DesignPatternTest;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

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

        manager.hireWorker("Kerr", Person.Sex.FEMALE, 1,  1, warehouse);
        manager.hireWorker("TT",  Person.Sex.MALE, 21, 10, warehouse);
        manager.hireWorker("Yuan", Person.Sex.FEMALE, 22, 10000, warehouse);
        manager.hireWorker("Muller", Person.Sex.MALE, 31, 2513, warehouse);

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
            else {
                System.out.println("\nHere is the searching result:");
                warehouse.searchStaffById(myId);
            }
        }

    }

}
