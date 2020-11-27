package team.charliechocolatefactory.factory;

import team.charliechocolatefactory.factory.support.PeriodicMaintenance;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.utilityworker.Cleaner;
import team.charliechocolatefactory.person.staff.worker.utilityworker.MaintenanceWorker;
import team.charliechocolatefactory.scene.GarbageStation;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.SceneNameConst;
import team.charliechocolatefactory.scene.SceneStructure;
import team.charliechocolatefactory.scene.publicarea.ExhibitionRoom;
import team.charliechocolatefactory.scene.publicarea.ExperienceRoom;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.WhiteWorkshop;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname CharlieFactory
 * @description
 * @date 2020/11/7 17:50
 */
public class CharlieFactory {

    private static CharlieFactory instance = null;

    private PeriodicMaintenance periodicMaintenance;

    private SceneStructure scenes;

    private boolean dirtyFlag = false;

    private boolean agingFlag = false;


    /*
    public CharlieFactory() {
        periodicMaintenance = new PeriodicMaintenance();
    }

    public static PeriodicMaintenance getPeriodicMaintenance() {
        return periodicMaintenance;
    }
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
    }

    /**
     *
     * @return
     */
    public static CharlieFactory getCharlieFactory() {
        if (instance == null) {
            instance = new CharlieFactory();
        }
        return instance;
    }

    /**
     *
     * @param scene
     */
    public void addScene(Scene scene) {
        scenes.addScene(scene);
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
     *
     * @param c cleaner object
     */
    public void clean(Cleaner c) {
        scenes.accept(c);
    }

    /**
     *
     */
    public void doClean() {

        Cleaner tempCleaner = new Cleaner("Temp Cleaner", 20, Person.Sex.MALE, 500);
        clean(tempCleaner);
        dirtyFlag = false;

        /*
        Office office = (Office) scenes.getSceneByName(SceneNameConst.OFFICE);
        if (office == null) {
            System.out.println("Need to add office scene.");
        }
        else {
            clean(office.getRandomCleaner());
        }

         */
    }

    /**
     * Periodically maintain the scenes
     *
     * @param m maintenance object
     */
    public void checkAndMaintenance(MaintenanceWorker m) {
        scenes.accept(m);
    }

    /**
     *
     */
    public void doMaintenance() {

        MaintenanceWorker tempWorker = new MaintenanceWorker("temp maintenance worker", 20, Person.Sex.MALE, 500);
        checkAndMaintenance(tempWorker);
        agingFlag = false;

        /*
        Office office = (Office) scenes.getSceneByName(SceneNameConst.OFFICE);
        if (office == null) {
            System.out.println("Need to add office scene.");
        }
        else {
            checkAndMaintenance(office.getRandomMaintenanceWorker());
        }
         */
    }

}
