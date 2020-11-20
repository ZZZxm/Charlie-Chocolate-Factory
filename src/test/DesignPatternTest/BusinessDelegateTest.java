package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseClient;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseDelegate;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

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


        System.out.println("Create a new warehouse...");
        Warehouse warehouse = new Warehouse();
        System.out.println("Create a new warehouse delegate...");
        WarehouseDelegate warehouseDelegate = new WarehouseDelegate(warehouse);
        System.out.println("Create a new warehouse client...");
        WarehouseClient warehouseClient = new WarehouseClient(warehouseDelegate);

        System.out.println("\nNow we need to get eggs from the warehouse.");
        warehouseDelegate.setServiceType("pickup");
        warehouseClient.doTask("");

    }

}
