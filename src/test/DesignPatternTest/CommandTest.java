package test.DesignPatternTest;

import team.charliechocolatefactory.machine.processmachine.wrappermachine.WrapperMachine;
import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Egg;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseClient;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseDelegate;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.WhiteWorkshop;

import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname CommandTest
 * @description TODO
 * @date 2020/11/21 21:32
 */
public class CommandTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Command] Test ------------------------------------");

        System.out.println("");
        System.out.println("Worker : produceDarkChocolate : Let the worker send a command to produce dark chocolate.");
        System.out.println("Product : producing : Transmit the command to a specific machine .");
        System.out.println("ProductMachine : process : Execute specific production process.");
        System.out.println("");

        System.out.println("Firstly, we need to create a worker.");
        Worker worker = new WorkshopWorker("worker", 18, Person.Sex.MALE, 10);

        System.out.println("");
        System.out.println("*******************             Command Test        *******************");
        System.out.println("***                 1. produce some dark chocolate                  ***");
        System.out.println("***                 2. produce chocolate cake                       ***");
        System.out.println("***                 3. produce chocolate cookie                     ***");
        System.out.println("***                 4. produce chocolate ice cream                  ***");
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
                    worker.produceDarkChocolate();
                    break;
                }
                case 2: {
                    worker.produceChocolateCake();
                    break;
                }
                case 3: {
                    worker.produceChocolateCookie();
                    break;
                }
                case 4: {
                    worker.produceChocolateIceCream();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
