package team.charliechocolatefactory.scene.staffarea.manufacturingarea.Delegate;

import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.Warehouse;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WarehouseDelegate
 * @description TODO Design pattern --- Business Delegate
 *              Clients can access service of warehouse by this delegate class
 * @date 2020/11/17 21:08
 */
public class WarehouseDelegate {

    /**
     * to look up materials in the warehouse
     */
    private WarehouseLookup lookupService = new WarehouseLookup();

    /**
     * access each kind of service of warehouse
     */
    private WarehouseService warehouseService;

    /**
     * warehouse connected to the delegate
     */
    private final Warehouse warehouse;

    /**
     * type of service
     */
    private String serviceType;

    public WarehouseDelegate(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * set the current service of warehouse:
     *      1. pickup
     *      2. storage
     * @param serviceType the current service type
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Generally, the method will not be directly invoked in the main function. It will be invoked in doTask() function
     * in the WarehouseClient class.
     *
     * Step 1: Get the warehouse service through lookup service.
     * Step 2: If the service is not found, print the wrong message.
     *         Otherwise, execute the exact service through the object "warehouseService" thats implements the
     *         interface WarehouseService.
     * @param rawMaterial raw material that is linked to the service
     */
    public void doTask(RawMaterial rawMaterial) {
        if (serviceType == null) {
            System.out.println("Invoke setServiceType() to set the type of service first.");
            return;
        }

        warehouseService = lookupService.getWarehouseService(serviceType);
        if (warehouseService != null) {
            warehouseService.doProcessing(warehouse, rawMaterial);
        }
    }
}
