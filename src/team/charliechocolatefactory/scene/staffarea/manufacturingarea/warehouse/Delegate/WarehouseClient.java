package team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate;

import team.charliechocolatefactory.rawmaterial.RawMaterial;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WarehouseClient
 * @description the presentation layer
 * Client of a warehouse, users can access service of warehouse through this client
 * @date 2020/11/17 21:44
 */
public class WarehouseClient {

    /**
     * the warehouse delegate
     */
    WarehouseDelegate warehouseDelegate;

    public WarehouseClient(WarehouseDelegate warehouseDelegate) {
        this.warehouseDelegate = warehouseDelegate;
    }

    /**
     * By invoking this method, service of warehouse will be applied.
     * You can set the type of service by invoking
     * -> warehouseDelegate.setServiceType()
     *
     * @param rawMaterial every service is linked to some material
     */
    public void doTask(RawMaterial rawMaterial) {
        warehouseDelegate.doTask(rawMaterial);
    }
}
