package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.staff.Manager;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname Dormitory
 * @description TODO
 * @date 2020/11/9 20:10
 */
public class Dormitory extends StaffArea {

    public Dormitory(String location, double cost, double area)
    {
        super(location, cost, area);
    }

    public Dormitory(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }

}
