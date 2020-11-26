package team.charliechocolatefactory.factory.support.payroll;

import team.charliechocolatefactory.person.staff.Staff;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname BonusPayroll
 * @description Pay out bonus wages for all staffs
 * @date 2020/11/21 20:32
 */
public class BonusPayroll extends Payroll {

    private int bonus;

    public BonusPayroll(int bonus) {
        super();
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void payOff() {
        for (Staff staff : staffList) {
            staff.getPaid(bonus);
        }
    }
}
