package test.DesignPatternTest;

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
        System.out.println("BasicProductMachine : process : Execute specific production process.");
        System.out.println("");


        System.out.println("Create a new workshop worker...");
        Worker worker = new WorkshopWorker("worker", 18, Person.Sex.MALE, 10, null);

        System.out.println("\nNow we need to produce some dark chocolate.");
        worker.produceDarkChocolate();

        System.out.println("\nNow we need to produce sine chocolate cake.");
        worker.produceChocolateCake();

        System.out.println("\nNow we need to produce some chocolate cookie.");
        worker.processChocolateCookie();

    }
}
