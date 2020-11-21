package team.charliechocolatefactory.scene;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname GarbageStation
 * @description GarbageStation is used to store garbage from the workshop
 * @date 2020/11/10 22:03
 */
public class GarbageStation extends Scene {

    /**
     * current amount of the garbage
     */
    protected int garbageAmount;

    /**
     * max amount of the garbage
     */
    protected int maxGarbageAmount;

    /**
     * constructor of GarbageStation
     */
    public GarbageStation(String location, double cost, double area, int maxAmount) {
        super(location, cost, area);
        garbageAmount = 0;
        maxGarbageAmount = maxAmount;
    }

    public GarbageStation() {
        super();
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return "garbage station";
    }

    /**
     * push garbage into the station
     *
     * @param amount new amount of the garbage
     */
    public void addGarbage(int amount) {
        if (garbageAmount + amount > maxGarbageAmount) {
            clearAllGarbage();
        }
        garbageAmount += amount;
        System.out.printf("Garbage has been added. The new amount of the gabbage is %d.\n", garbageAmount);
    }

    /**
     * clear all garbage
     */
    public void clearAllGarbage() {
        maxGarbageAmount = 0;
        System.out.println("All garbage has been cleared.");
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
