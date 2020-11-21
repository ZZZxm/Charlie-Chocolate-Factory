package team.charliechocolatefactory.scene.publicarea;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.person.visitor.Visitor;
import team.charliechocolatefactory.scene.Scene;

import java.util.LinkedList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname PublicArea
 * @description Inherited from basic class scene, it represents scenes open for everyone.
 * @date 2020/11/9 19:43
 */
public abstract class PublicArea extends Scene {

    /**
     * The max number of visitors in the room
     **/
    protected int maxVisitorNumber;

    /**
     * List of all the visitors in the room
     **/
    protected LinkedList<Visitor> visitorList;

    /**
     * constructor of PublicArea
     */
    public PublicArea(String location, double cost, double area, int maxNumber) {
        super(location, cost, area);
        this.maxVisitorNumber = maxNumber;
        this.visitorList = new LinkedList<Visitor>();
    }

    public PublicArea() {
        this("Public Location", 10000, 100, 200);
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public abstract String toString();

    /**
     * when a visitor enters the area, add him to the list
     *
     * @param visitorObj visitor object
     */
    public void addVisitor(Visitor visitorObj) {
        if (visitorList.size() >= maxVisitorNumber) {
            System.out.println("The area is already full");
        } else if (visitorList.contains(visitorObj)) {
            System.out.println("The area is already in the area");
        } else {
            visitorList.add(visitorObj);
        }
    }

    /**
     * when a visitor leaves the area, remove him from the list
     *
     * @param visitorObj visitor object
     */
    public void removeVisitor(Visitor visitorObj) {
        if (visitorList.contains(visitorObj)) {
            visitorList.remove(visitorObj);
        } else {
            System.out.println("The area is not in the area");
        }
    }

    /**
     * check whether a visitor object is in the list
     *
     * @param visitorObj visitor object
     * @return true if the visitor is in
     */
    public boolean checkVisitor(Visitor visitorObj) {
        return visitorList.contains(visitorObj);
    }

    /**
     * check whether the area is full
     *
     * @return true if the area is full
     */
    public boolean isFull() {
        return visitorList.size() >= maxVisitorNumber;
    }

    /**
     * maintain exhibits
     */
    public void getExhibitsMaintained() {
        System.out.println("The exhibits have been maintained.");
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(UtilityWorker worker);

}
