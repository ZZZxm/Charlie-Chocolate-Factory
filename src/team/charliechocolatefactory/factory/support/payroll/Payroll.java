package team.charliechocolatefactory.factory.support.payroll;

import team.charliechocolatefactory.person.staff.Staff;

import java.util.List;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Payroll
 * @description abstract class for payroll
 *              TODO Design Pattern --- Observer
 * @date 2020/11/21 20:20
 */
public abstract class Payroll {

    protected List<Staff> staffList;

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public abstract void payOff();
}
