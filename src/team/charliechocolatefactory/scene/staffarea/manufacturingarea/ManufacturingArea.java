package team.charliechocolatefactory.scene.staffarea.manufacturingarea;

import team.charliechocolatefactory.machine.Machine;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

import java.util.ArrayList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname ManufacturingArea
 * @description Inherited from StaffArea, this class represents areas for manufacturing(warehouses and workshops)
 * @date 2020/11/9 20:01
 */
public abstract class ManufacturingArea extends StaffArea {

    /**
     * List of all machines in the manufacturing area
     **/
    protected ArrayList<Machine> machineList;

    /**
     * Constructor of ManufacturingArea with no manager specified
     */
    public ManufacturingArea(String location, double cost, double area) {
        this(location, cost, area, null);
    }

    /**
     * Constructor of ManufacturingArea with manager specified
     */
    public ManufacturingArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
        machineList = new ArrayList<Machine>();
    }

    public ManufacturingArea() {
        this("Manufacturing Location",10000,100);
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public abstract String toString();

    /**
     * add a machine to the room
     *
     * @param machineObj machine object
     */
    public void addMachine(Machine machineObj) {
        if (machineList.contains(machineObj)) {
            System.out.println("The machine is already in the area");
        } else {
            machineList.add(machineObj);
        }
    }

    /**
     * remove a machine from the room
     *
     * @param machineObj machine object
     */
    public void removeMachine(Machine machineObj) {
        if (machineList.contains(machineObj)) {
            machineList.remove(machineObj);
        } else {
            System.out.println("The machine doesn't exist");
        }
    }

    /**
     * check whether a machine is in the area
     *
     * @param machineObj machine object
     * @return true if the machine is in the area
     */
    public boolean MachineExists(Machine machineObj) {
        return machineList.contains(machineObj);
    }

    /**
     * maintained all machines
     */
    public void getAllMachinesMaintained() {
        for (Machine obj : machineList) {
            obj.maintenance();
        }
        System.out.println("The machines have been maintained.");
    }

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(UtilityWorker worker);

}
