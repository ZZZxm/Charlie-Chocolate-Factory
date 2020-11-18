package team.charliechocolatefactory.person.stockholder;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.scene.Scene;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Stockholder
 * @description stockholders of our factory
 * @date 2020/11/7 18:45
 */
public class Stockholder extends Person {

    public String identity="stockholder";

    public Stockholder(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    /**
     * A stockholder can move to anywhere.
     * @param dest destination
     * @return whether he/she moves to the destination successfully.
     */
    @Override
    public boolean moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The stockholder " + this.name + " moves to " + dest.toString());
        return true;
    }

    /**
     * set the initial asset of the stockholder
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 100000;
    }

    @Override
    public String toString() {
        return "class Stockholder extends Person";
    }
}
