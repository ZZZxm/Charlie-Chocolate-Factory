package team.charliechocolatefactory;

import team.charliechocolatefactory.person.staff.worker.Cleaner;
import team.charliechocolatefactory.person.staff.worker.MaintenanceWorker;
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

    public PeriodicMaintenance() {
        scenes = new SceneStructure();
    }

    public PeriodicMaintenance(SceneStructure sst) {
        scenes = sst;
    }

    /**
     * Periodically clean the scenes
     * @param c cleaner object
     */
    public void clean(Cleaner c)
    {
        scenes.accept(c);
    }

    /**
     * Periodically maintain the scenes
     * @param m maintenance object
     */
    public void checkAndMaintenance(MaintenanceWorker m)
    {
        scenes.accept(m);
    }

}
