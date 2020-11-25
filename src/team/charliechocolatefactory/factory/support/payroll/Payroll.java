package team.charliechocolatefactory.factory.support.payroll;

import team.charliechocolatefactory.person.staff.Staff;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Payroll
 * @description abstract class for payroll
 * TODO Design Pattern --- Observer
 * @date 2020/11/21 20:20
 */
public abstract class Payroll {

    protected List<Staff> staffList;

    /**
     * add a staff into the payroll
     * @param staff the added staff
     */
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    /**
     * add all staffs in the staff area into the payroll
     * @param staffArea staff area to added
     */
    public void addAllStaffs(StaffArea staffArea) {
        ArrayList<Worker> list = staffArea.getWorkerList();
        staffList.addAll(list);
    }

    /**
     * remove a staff from the payroll
     * @param staff the removed staff
     */
    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    /**
     * pay off for <a>all the staffs</a> in the staff list
     * implementation will be included in the concrete payoff class
     */
    public abstract void payOff();
}
