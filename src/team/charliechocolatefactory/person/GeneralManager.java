package team.charliechocolatefactory.person;

//import sun.java2d.loops.FillRect;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.Staff;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

import java.util.ArrayList;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname GeneralManager
 * @description There is only one general manager of the chocolate factory.
 *              TODO Design Pattern --- Singleton
 * @date 2020/11/7 18:13
 */
public class GeneralManager extends Person {

    public String identity="general manager";

    GeneralManager instance = null;
 *              TODO This class realizes the design pattern SINGLETON.
 * @date 2020/11/7 18:13s
 */
public class GeneralManager extends Person {

    static GeneralManager instance = null;

    public ArrayList<Manager> managerList;

    /**
     * Get the only instance of the general manager.
     * An instance of GM will be created when you call this function for the first time.
     * Then it will return the instance in the future.
     * @return instance of general manager
     */
    public static GeneralManager getInstance() {
        if (instance == null) {
            instance = new GeneralManager("Young young", 21, Sex.MALE);
            System.out.println("We didn't have a general manager yet. Now our general manager has taken over.");
        }
        else {
            System.out.println("Here is our general manager.");
        }
        return instance;
    }

    /**
     * receive workers feed backs through the scene managers, and gives a solution toward the issue.
     */
    public void receiveFeedBack(){
        System.out.println("General manager received the feed back and solve it.");
    }

    /**
     * add manager to the list
     * @param manager
     */
    public void addManager(Manager manager){
        this.managerList.add(manager);
    }

    /**
     * dispatch works to managers
     */
    public void dispatchWork(){
        if(managerList.isEmpty()){
            System.out.println("Please add manager to each scene first!!");
        }
        for(Manager manager:managerList){
            System.out.println("Dispatch work to "+ manager.name);
            manager.dispatchTask();
        }
    }
    /**
     * General Manager can move to anywhere.
     * @param dest destination
     */
    @Override
    public boolean moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The general manager " + this.name + "moves to " + dest.toString());
        return true;
    }

    /**
     * set the initial asset of GM
     * He/She must be a rich man!
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 10000000;
    }

    @Override
    public String toString() {
        return "class GeneralManager extends Staff";
    }

    /**
     * There is only one general manager(GM) in our factory, so the constructor should be private.
     * If you want to get the instance of GM, please use the function getInstance()
     * @param name name of the general manager
     * @param age age of the general manager
     * @param sex sex of the general manager
     */
    private GeneralManager(String name, int age, Sex sex) {
        super(name, age, sex);
    }
}
