package team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WarehouseLookup
 * @description To look up a warehouse service
 * @date 2020/11/17 21:11
 */
public class WarehouseLookup {

    /**
     * @param serviceType the wanted service type
     * @return If found, return an object of the wanted service type
     * If not found, return null
     */
    public WarehouseService getWarehouseService(String serviceType) {

        if (serviceType.equalsIgnoreCase("pickup")) {
            return new PickupService();
        }
        if (serviceType.equalsIgnoreCase("storage")) {
            return new StorageService();
        }
        return null;
    }
}
