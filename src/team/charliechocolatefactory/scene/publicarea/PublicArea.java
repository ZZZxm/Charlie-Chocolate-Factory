package team.charliechocolatefactory.scene.publicarea;

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
    PublicArea(String location, double cost, double area, int maxNumber) {
        super(location, cost, area);
        this.maxVisitorNumber = maxNumber;
        this.visitorList = new LinkedList<Visitor>();
    }

    /**
     * when a visitor enters the area, add him to the list
     * @param visitorObj visitor object
     */
    void addVisitor(Visitor visitorObj) {
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
     * @param visitorObj visitor object
     */
    void removeVisitor(Visitor visitorObj) {
        if (visitorList.contains(visitorObj)) {
            visitorList.remove(visitorObj);
        } else {
            System.out.println("The area is not in the area");
        }
    }

    /**
     * check whether a visitor object is in the list
     * @param visitorObj visitor object
     * @return true if the visitor is in
     */
    boolean checkVisitor(Visitor visitorObj) {
        return visitorList.contains(visitorObj);
    }

    /**
     * check whether the area is full
     * @return true if the area is full
     */
    boolean isFull() {
        return visitorList.size() >= maxVisitorNumber;
    }

}