package team.charliechocolatefactory.factory.support;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.*;
import team.charliechocolatefactory.scene.SceneNameConst;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname WorkerAddingController
 * @description OCL Pattern: create worker objects here
 * @date 2020/11/20 15:00
 */
public class WorkerAddingController {

    /**
     * create a worker object and add it to the scene
     *
     * @param name   name of the worker
     * @param age    age of the worker
     * @param sex    sex of the worker
     * @param salary salary of the worker
     * @param scene  scene the worker belongs to
     */
    public static void addWorkerToScene(String name, int age, Person.Sex sex, int salary, StaffArea scene) {

        Worker workerObj;
        if (scene.toString().equals(SceneNameConst.OFFICE)) {
            workerObj = new OfficeWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        } else if (scene.toString().equals(SceneNameConst.DINING_ROOM)) {
            workerObj = new DinningRoomWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        } else if (scene.toString().contains(SceneNameConst.WORKSHOP)) {
            workerObj = new WorkshopWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        } else if (scene.toString().equals(SceneNameConst.WAREHOUSE)) {
            workerObj = new WarehouseWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        }

    }

}
