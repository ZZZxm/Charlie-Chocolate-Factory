package test.DesignPatternTest;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.OfficeWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;
import team.charliechocolatefactory.person.visitor.Visitor;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.WorkerIterator.WorkerListIterator;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;

import java.util.Scanner;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname InterpreterTest
 * @description TODO
 * @date 2020/11/27 00:23
 */
public class InterpreterTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Interpreter] Test ---------------------------------");
        System.out.println("");
        System.out.println("Terminal Expression:interpret(info:String): to judge whether the string is a terminal symbol.");
        System.out.println("|--[parameter] info: the string being analysed.(e.g. \"sb. enter somewhere\")");
        System.out.println("AndExpression:interpret(info:String): Determines whether the string being analyzed is the");
        System.out.println("identity that meets the criteria or the region that meets the criteria.");
        System.out.println("Context:canEnter(info:String): invoke AndExpression.interpret() to explain the string which is analysed.");
        System.out.println("|--[parameter] info: the string being analysed.(e.g. \"sb. enter somewhere\")");;
        System.out.println("Visitor:moveTo(dest:Scene): Create a Context object internally that indirectly accesses the interpreter's");
        System.out.println("interpretation method to determine whether a person can enter an area.");
        System.out.println("|--[parameter] dest: the destination");
        System.out.println("");

        System.out.println("*********************************** Iterator Test ***********************************");
        System.out.println("***                                                                               ***");
        System.out.println("***       0. exit                                                                 ***");
        System.out.println("***       1. Get the first workers in the darkChocolateWorkShop                   ***");
        System.out.println("***       2. Traverse all staff of the staffs in the office                       ***");
        System.out.println("***                                                                               ***");
        System.out.println("*************************************************************************************");

        Visitor visitor = new Visitor("HappyYQing",20, Person.Sex.FEMALE);
        Warehouse warehouse = new Warehouse();

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int op;
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
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
