package team.charliechocolatefactory.scene.staffarea.manufacturingarea;

import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname WorkingArea
 * @description TODO
 * @date 2020/11/9 20:01
 */
public abstract class ManufacturingArea extends StaffArea {

    //protected ArrayList<Machine> machineList;

    public ManufacturingArea(String location, double cost, double area) {
        super(location, cost, area);
        //machineList = new ArrayList<Machine>();
    }
}
