package team.charliechocolatefactory.factory.support.payroll;

import team.charliechocolatefactory.person.staff.Staff;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WagePayroll
 * @description Pay out normal wages for all staffs
 * @date 2020/11/21 20:28
 */
public class WagePayroll extends Payroll {

    @Override
    public void payOff() {
        for (Staff staff : staffList) {
            staff.getPaid();
        }
    }
}
