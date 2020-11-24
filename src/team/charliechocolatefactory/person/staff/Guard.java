package team.charliechocolatefactory.person.staff;

//import com.sun.corba.se.spi.orbutil.threadpool.Work;
import team.charliechocolatefactory.scene.staffarea.StaffArea;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.factory.support.SecurityCheckTask;

import java.util.Observable;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Guard
 * @description a kind of staff
 * @date 2020/11/10 15:27
 */
public class Guard extends Staff {

    public String identity = "guard";
    private SecurityCheckTask securityCheckTask;

    public Guard(String name, int age, Sex sex, int salary, StaffArea workingArea) {
        super(name, age, sex, salary, workingArea);
    }

    public Guard(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    /**
     * @param worker
     * @modified by Ray
     */
    public void sayMorning(Worker worker) {
        System.out.println("早安！打工人" + worker.getName());
        worker.respondMorning();
    }

    public void setSecurityCheckTask(SecurityCheckTask st) {
        this.securityCheckTask = st;
    }

    public void checkRoomSecurity() {
        securityCheckTask.checkRoomSecurity();
    }

    public void checkMachineSecurity() {
        securityCheckTask.checkMachineSecurity();
    }

    public void report() {
        securityCheckTask.report();
    }

    @Override
    protected void setInitialAsset() {
        this.asset = 500;
    }

    @Override
    public String toString() {
        return "class Guard extends Staff";
    }

}
