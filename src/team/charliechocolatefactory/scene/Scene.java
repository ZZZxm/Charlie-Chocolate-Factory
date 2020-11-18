package team.charliechocolatefactory.scene;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.person.stockholder.Stockholder;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Scene
 * @description The basic class of Scene, each scene has its own function
 * @date 2020/11/9 10:26
 */
public abstract class Scene {

    /**
     * location of this site
     */
    protected String location;

    /**
     * cost of this site, per year
     */
    protected double cost;

    /**
     * area of this site
     */
    protected double area;

    public Scene(String location, double cost, double area) {
        this.location = location;
        this.cost = cost;
        this.area = area;
    }


    public Scene(){}

    public Scene(double cost) {
        this.cost = cost;
    }



    /**
     * @return name of the scene as a String
     */
    @Override
    public abstract String toString();

    /**
     * @return location of this site
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * relocate the site, only the general manager and the stockholder can make this change
     *
     * @param newLocation new location of the site
     * @return whether the relocation can be applied
     */
    public boolean relocate(Person executor, String newLocation) {
        if (executor instanceof GeneralManager || executor instanceof Stockholder) {
            this.location = newLocation;
            return true;
        } else {
            System.out.println("Sorry, you have no authority to move the sites.");
            return false;
        }
    }

    /**
     * @return cost of this site
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * set a new cost of this site
     *
     * @param newCost new cost of this site
     */
    public void setCost(double newCost) {
        this.cost = newCost;
    }

    /**
     * @return area of this site
     */
    public double getArea() {
        return this.area;
    }

    /**
     * the site may be expanded or reduced
     *
     * @param newArea the new area of this site
     */
    public void setArea(double newArea) {
        this.area = newArea;
    }

    /**
     * print a line to show that the scene is cleaned up
     */
    public void getCleanUp() {
        System.out.println("The " + toString() + " is cleaned up.");
    }

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(UtilityWorker worker);

}
