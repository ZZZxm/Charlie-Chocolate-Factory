package team.charliechocolatefactory.person;

//import sun.java2d.loops.FillRect;

import team.charliechocolatefactory.person.filterchain.message.Message;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.scene.Scene;

import java.util.ArrayList;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname GeneralManager
 * @description There is only one general manager of the chocolate factory.
 * TODO Design Pattern --- Singleton
 * @date 2020/11/7 18:13
 */
public class GeneralManager extends Person {

    public String identity = "general manager";

    private static GeneralManager instance = null;

    public ArrayList<Manager> managerList;

    /**
     * Get the only instance of the general manager.
     * An instance of GM will be created when you call this function for the first time.
     * Then it will return the instance in the future.
     *
     * @return instance of general manager
     */
    public static GeneralManager getInstance() {
        if (instance == null) {
            instance = new GeneralManager("Young young", 20, Sex.MALE);
        }
        return instance;
    }

    /**
     * receive workers feed backs through the scene managers, and gives a solution toward the issue.
     */
    public void receiveFeedBack() {
        System.out.println("General manager received the feed back and solve it.");
    }

    /**
     * add manager to the list
     * @param manager manager
     */
    public void addManager(Manager manager) {
        if (manager != null) {
            this.managerList.add(manager);
        }
    }

    /**
     * dispatch works to managers
     */
    public void dispatchWork() {
        if (managerList.isEmpty()) {
            System.out.println("Please add manager to each scene first!!");
        }
        for (Manager manager : managerList) {
            System.out.println("Dispatch work to " + manager.name);
            manager.dispatchTask();
        }
    }

    /**
     * General Manager can move to anywhere.
     *
     * @param dest destination
     */
    @Override
    public void moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The general manager " + this.name + "moves to " + dest.toString());
    }

    /**
     * set the initial asset of GM
     * He/She must be a rich man!
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 10000000;
    }

    /**
     * This method is used to process messages.
     * If you do not agree to the request,
     * it will return false. If you agree, it will be submitted to the next level for approval.
     * If you are the last level, you will return true.
     *
     * @param requestMessage：sendMessage
     * @return Processing results
     */
    @Override
    public boolean HandleRequest(Message requestMessage) {
        System.out.println(this.identity + " " + this.name + " is handling request.");
        if (requestMessage.getMessageInfo().charAt(0) == 'G') {
            System.out.println(this.identity + " " + this.name + " rejects the request.");
            return false;
        }
        System.out.println(this.identity + " " + this.name + " approves the request.");
        if (successor != null) {
            return successor.HandleRequest(requestMessage);
        } else {
            System.out.println("The request is eventually approved. The content of the message is: " + requestMessage.getMessageInfo());
            return true;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralManager)) {
            return false;
        }
        GeneralManager temp = (GeneralManager) obj;
        return this.name.equals(temp.name);
    }

    @Override
    public String toString() {
        return "class GeneralManager extends Staff";
    }

    /**
     * There is only one general manager(GM) in our factory, so the constructor should be private.
     * If you want to get the instance of GM, please use the function getInstance()
     *
     * @param name name of the general manager
     * @param age  age of the general manager
     * @param sex  sex of the general manager
     */
    private GeneralManager(String name, int age, Sex sex) {
        super(name, age, sex);
        managerList = new ArrayList<Manager>();
    }
}
