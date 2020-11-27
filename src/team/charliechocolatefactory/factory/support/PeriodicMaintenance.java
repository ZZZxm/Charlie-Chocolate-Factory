package team.charliechocolatefactory.factory.support;

import team.charliechocolatefactory.person.staff.worker.utilityworker.Cleaner;
import team.charliechocolatefactory.person.staff.worker.utilityworker.MaintenanceWorker;
import team.charliechocolatefactory.scene.SceneStructure;


/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname PeriodicMaintenance
 * @description main class for visitor pattern TODO merge into factory class
 * @date 2020/11/18 16:55
 */
public class PeriodicMaintenance {

    /**
     * all scenes in the factory
     */
    private SceneStructure scenes;

    private boolean dirtyFlag = false;

    private boolean agingFlag = false;

    public PeriodicMaintenance() {
        scenes = new SceneStructure();
    }

    public PeriodicMaintenance(SceneStructure sst) {
        scenes = sst;
    }

    public void setDirtyTrue() {
        this.dirtyFlag = true;
    }

    public boolean getDirtyFlag() {
        return this.dirtyFlag;
    }

    public void setAgingTrue() {
        this.agingFlag = true;
    }

    public boolean getAgingFlag() {
        return this.agingFlag;
    }

    /**
     * Periodically clean the scenes
     * @param c cleaner object
     */
    public void clean(Cleaner c)
    {
        scenes.accept(c);
    }

    public void doClean() {

    }

    /**
     * Periodically maintain the scenes
     * @param m maintenance object
     */
    public void checkAndMaintenance(MaintenanceWorker m)
    {
        scenes.accept(m);
    }

    public void doMaintenance() {

    }

}
