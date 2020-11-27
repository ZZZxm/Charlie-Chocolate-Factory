package team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate;

import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname PickupService
 * @description a kind of warehouse service that help get material from warehouse
 * @date 2020/11/17 21:14
 */
public class PickupService implements WarehouseService {

    @Override
    public void doProcessing(Warehouse warehouse, RawMaterial rawMaterial) {
        warehouse.useMaterial(rawMaterial.toString(), 1.0);
        System.out.println("Finish pickup service for " + rawMaterial.toString());
    }
}
