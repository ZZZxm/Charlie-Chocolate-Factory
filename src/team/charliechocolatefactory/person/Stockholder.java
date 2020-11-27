package team.charliechocolatefactory.person;

import team.charliechocolatefactory.person.filterchain.message.Message;
import team.charliechocolatefactory.scene.Scene;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Stockholder
 * @description stockholders of our factory
 * @date 2020/11/7 18:45
 */
public class Stockholder extends Person {

    public String identity = "stockholder";

    public Stockholder(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    /**
     * A stockholder can move to anywhere.
     *
     * @param dest destination
     */
    @Override
    public void moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The stockholder " + this.name + " moves to " + dest.toString());
    }

    /**
     * set the initial asset of the stockholder
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 100000;
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
        if (requestMessage.getMessageInfo().charAt(0) == 'S') {
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
        if (!(obj instanceof Stockholder)) {
            return false;
        }
        Stockholder temp = (Stockholder) obj;
        return this.name.equals(temp.name);
    }


    @Override
    public String toString() {
        return "class Stockholder extends Person";
    }
}
