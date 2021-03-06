package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.SceneNameConst;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname DiningRoom
 * @description Used for staffs to have breakfast, lunch or supper.
 * @date 2020/11/9 20:00
 */
public class DiningRoom extends StaffArea {


    public DiningRoom() {
        this("Dining room", 10000, 100);
    }

    /**
     * constructor of the DiningRoom with manager specified
     */
    public DiningRoom(String location, double cost, double area) {
        super(location, cost, area, Manager.getDiningRoomManager());
        Manager.getDiningRoomManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getDiningRoomManager());
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return SceneNameConst.DINING_ROOM;
    }

    /**
     * maintain the devices in the dining room
     */
    public void getDevicesMaintained() {
        System.out.println("The tables and cookers have been maintained.");
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

}
