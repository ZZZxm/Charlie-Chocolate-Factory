package team.charliechocolatefactory.factory;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.utilityworker.Cleaner;
import team.charliechocolatefactory.person.staff.worker.utilityworker.MaintenanceWorker;
import team.charliechocolatefactory.scene.GarbageStation;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.SceneStructure;
import team.charliechocolatefactory.scene.decorator.Flat;
import team.charliechocolatefactory.scene.decorator.Villa;
import team.charliechocolatefactory.scene.publicarea.ExhibitionRoom;
import team.charliechocolatefactory.scene.publicarea.ExperienceRoom;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.WhiteWorkshop;

/**
 * @author Brian.Z, Y.C.Young
 * @project chocolateFactory
 * @classname CharlieFactory
 * @description the factory class (including attributes and methods for visitor pattern)
 * @date 2020/11/7 17:50
 */
public class CharlieFactory {

    /**
     * the only one instance of the factory
     */
    private static CharlieFactory instance = null;

    /**
     * scene structure containing all scenes in the factory
     */
    private SceneStructure scenes;

    /**
     * flag showing whether the factory is to clean
     */
    private boolean dirtyFlag = false;

    /**
     * flag showing whether the factory is to maintenance
     */
    private boolean agingFlag = false;

    /**
     * constructor of the factory
     */
    private CharlieFactory() {
        scenes = new SceneStructure();
        scenes.addScene(new ExhibitionRoom("", 5e5, 300.0, 100));
        scenes.addScene(new ExperienceRoom("", 2e5, 400.0, 50));
        scenes.addScene(new Warehouse("", 2e6, 2000.0));
        scenes.addScene(new DarkWorkshop("", 2e6, 1500.0, "PR", "0324", 250));
        scenes.addScene(new WhiteWorkshop("", 2e6, 1200.0, "PR", "1825", 250));
        scenes.addScene(new DiningRoom("", 3e5, 500.0));
        scenes.addScene(new Office("", 3e5, 800.0));
        scenes.addScene(new GarbageStation("", 2e5, 100.0, 1000));
        // scenes.addScene(new Flat("", 2e5, 500.0));
        // scenes.addScene(new Villa("", 1e6, 350.0));
    }

    /**
     * using Singleton pattern to get or create the only one instance of the class
     *
     * @return the only one instance of the factory class
     */
    public static CharlieFactory getCharlieFactory() {
        if (instance == null) {
            instance = new CharlieFactory();
        }
        return instance;
    }

    /**
     * add a scene to the factory
     *
     * @param scene the scene to be added to the factory
     */
    public void addScene(Scene scene) {
        scenes.addScene(scene);
    }

    /**
     * set the dirty flag true
     */
    public void setDirtyTrue() {
        this.dirtyFlag = true;
    }

    /**
     * get the value of dirty flag
     *
     * @return the value of dirty flag
     */
    public boolean getDirtyFlag() {
        return this.dirtyFlag;
    }

    /**
     * set the aging flag true
     */
    public void setAgingTrue() {
        this.agingFlag = true;
    }

    /**
     * get the value of aging flag
     *
     * @return the value of aging flag
     */
    public boolean getAgingFlag() {
        return this.agingFlag;
    }

    /**
     * Periodically clean the scenes
     *
     * @param c cleaner object
     */
    public void clean(Cleaner c) {
        scenes.accept(c);
    }

    /**
     * interface of clean operation for TimeSystem class
     */
    public void doClean() {

        // hire a temporary cleaner
        Cleaner tempCleaner = new Cleaner("Temp Cleaner", 20, Person.Sex.MALE, 500);

        clean(tempCleaner);
        dirtyFlag = false;

    }

    /**
     * Periodically maintain the scenes
     *
     * @param m maintenance object
     */
    public void maintain(MaintenanceWorker m) {
        scenes.accept(m);
    }

    /**
     * interface of maintenance operation for TimeSystem class
     */
    public void doMaintenance() {

        // hire a temporary maintenance worker
        MaintenanceWorker tempWorker = new MaintenanceWorker("temp maintenance worker", 20, Person.Sex.MALE, 500);

        maintain(tempWorker);
        agingFlag = false;

    }

}
