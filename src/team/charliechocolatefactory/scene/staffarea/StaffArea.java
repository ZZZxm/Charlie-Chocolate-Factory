package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.Scene;

import java.util.ArrayList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname StaffScene
 * @description Inherited from basic class scene, it represents scene only open for staffs.
 * @date 2020/11/9 19:44
 */
public abstract class StaffArea extends Scene {

    protected Manager manager;
    protected ArrayList<Worker> workerList;

    public StaffArea(String location, double cost, double area) {
        this(location, cost, area, null);
    }

    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<>();
        manager = newManager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager newManager) {
        manager = newManager;
    }

    public void addWorker(Worker workerObj) {
        if (workerList.contains(workerObj)) {
            System.out.println("Worker object exists.");
        } else {
            workerList.add(workerObj);
        }
    }

    public void removeWorker(Worker workerObj) {
        if (workerList.contains(workerObj)) {
            workerList.remove(workerObj);
        } else {
            System.out.println("Worker object doesn't exist.");
        }
    }

    public boolean checkWorker(Worker workerObj) {
        return workerList.contains(workerObj);
    }

}
