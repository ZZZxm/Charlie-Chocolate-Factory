package team.charliechocolatefactory.person.staff.worker.utilityworker;

import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.GarbageStation;
import team.charliechocolatefactory.scene.publicarea.PublicArea;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.StaffArea;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname FixWorker
 * @description workers checking safety risks of scenes and keeping scenes safe
 * @date 2020/11/18 16:48
 */
public class MaintenanceWorker extends Worker implements UtilityWorker {

    public MaintenanceWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("The maintenance worker " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The maintenance worker " + this.name + "goes to rest.");
    }

    @Override
    public void feedBack() {

    }

    /**
     * implement methods defined in interface to maintain the garbage station
     *
     * @param s garbage station scene
     */
    @Override
    public void visit(GarbageStation s) {

    }

    /**
     * implement methods defined in interface to maintain the public area
     *
     * @param s public area scene
     */
    @Override
    public void visit(PublicArea s) {
        s.getExhibitsMaintained();
    }

    /**
     * implement methods defined in interface to maintain the office
     *
     * @param s office scene
     */
    @Override
    public void visit(Office s) {

    }

    /**
     * implement methods defined in interface to maintain the manufacturing area
     *
     * @param s manufacturing area scene
     */
    @Override
    public void visit(ManufacturingArea s) {
        s.getAllMachinesMaintained();
    }

    /**
     * implement methods defined in interface to maintain the dining room
     *
     * @param s dining room scene
     */
    @Override
    public void visit(DiningRoom s) {
        s.getDevicesMaintained();
    }

}
