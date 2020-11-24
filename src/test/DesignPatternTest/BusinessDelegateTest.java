package test.DesignPatternTest;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import jdk.nashorn.internal.ir.CaseNode;
import jdk.nashorn.internal.ir.Flags;
import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Egg;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseClient;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseDelegate;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname BusinessDelegateTest
 * @description Test for Design Pattern --- Business Delegate
 * @date 2020/11/20 18:03
 */
public class BusinessDelegateTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Business Delegate] Test ------------------------------------");

        System.out.println("");
        System.out.println("WarehouseDelegate : doTask(rawMaterial: RawMaterial) : Let the warehouse execute specific task");
        System.out.println("WarehouseDelegate : setServiceType(serviceType: String) : Set the type of warehouse service");
        System.out.println("WarehouseLookup : getWarehouseService(serviceType: String) : get the warehouse service if exists " +
                "and return the instance of service");
        System.out.println("WarehouseService : doProcessing(warehouse: Warehouse, rawMaterial: RawMaterial) : " +
                "Every warehouse service must implement the method to execute service.");
        System.out.println("");

        System.out.println("");
        System.out.println("******************* Business Delegate Test *******************");
        System.out.println("***                 1. Create a warehouse client           ***");
        System.out.println("***                 2. Get eggs from the warehouse         ***");
        System.out.println("***                 3. Store eggs into the warehouse       ***");
        System.out.println("***                 4. Try a wrong test                    ***");
        System.out.println("***                                                        ***");
        System.out.println("***Tips: Please execute order 1 first.                     ***");
        System.out.println("**************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        WarehouseDelegate warehouseDelegate = null;
        WarehouseClient warehouseClient = null;

        do {
            System.out.println("");
            System.out.println("Enter the order [0 to quit]:");
            op = input.nextInt();

            if (warehouseDelegate == null && op > 1) {
                System.out.println("Please execute ‘1. Create a warehouse client’ first.");
                continue;
            }

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Create a new warehouse...");
                    Warehouse warehouse = new Warehouse();
                    System.out.println("Create a new warehouse delegate...");
                    warehouseDelegate = new WarehouseDelegate(warehouse);
                    System.out.println("Create a new warehouse client...");
                    warehouseClient = new WarehouseClient(warehouseDelegate);
                    break;
                }
                case 2: {
                    System.out.println("\nNow we need to get eggs from the warehouse.");
                    warehouseDelegate.setServiceType("pickup");
                    warehouseClient.doTask(new Egg());
                    break;
                }
                case 3: {
                    System.out.println("\nNow we need to store eggs from the warehouse.");
                    warehouseDelegate.setServiceType("storage");
                    warehouseClient.doTask(new Egg());
                    break;
                }
                case 4: {
                    System.out.println("\nLet's input a wrong service type.");
                    warehouseDelegate.setServiceType("hahahahaha");
                    warehouseClient.doTask(new Egg());
                    break;
                }
            }
        } while (flag);
    }

}
