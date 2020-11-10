package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.staff.Manager;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname LivingArea
 * @description TODO
 * @date 2020/11/9 20:00
 */
public class DiningRoom extends StaffArea {

    public DiningRoom(String location, double cost, double area)
    {
        super(location, cost, area);
    }

    public DiningRoom(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }

}
