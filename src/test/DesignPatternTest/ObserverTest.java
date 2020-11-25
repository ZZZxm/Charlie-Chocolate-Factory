package test.DesignPatternTest;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname ObserverTest
 * @description Test for Design Pattern --- Observer
 * @date 2020/11/24 22:36
 */
public class ObserverTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Observer] Test ------------------------------------");

        System.out.println("");
        System.out.println("Payroll : addStaff(staff : Staff) : add a staff into the payroll");
        System.out.println("Payroll : addAllStaffs(staffArea : StaffArea) : add all staffs in the staff area into the payroll");
        System.out.println("Payroll : removeStaff(staff : Staff) : remove a staff from the payroll");
        System.out.println("");

        System.out.println("");
        System.out.println("***************************** Observer Test ***************************");
        System.out.println("***                 1. order1                                       ***");
        System.out.println("***                 2. order2                                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***Tips: 给用户的一些使用提示                                         ***");
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
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
