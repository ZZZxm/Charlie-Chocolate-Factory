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
 * @classname Cleaner
 * @description workers cleaning the scenes
 * @date 2020/11/18 16:47
 */
public class Cleaner extends Worker implements UtilityWorker {

    public Cleaner(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("The cleaner " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The cleaner " + this.name + "goes to rest.");
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
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the public area
     *
     * @param s public area scene
     */
    @Override
    public void visit(PublicArea s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the office
     *
     * @param s office scene
     */
    @Override
    public void visit(Office s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the manufacturing area
     *
     * @param s manufacturing area scene
     */
    @Override
    public void visit(ManufacturingArea s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the dining room
     *
     * @param s dining room scene
     */
    @Override
    public void visit(DiningRoom s) {
        s.getCleanUp();
    }
}
