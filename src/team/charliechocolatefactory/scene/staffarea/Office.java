package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname Office
 * @description TODO
 * @date 2020/11/9 20:04
 */
public class Office extends StaffArea {

    public Office(String location, double cost, double area)
    {
        super(location, cost, area);
    }

    public Office(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }

}
