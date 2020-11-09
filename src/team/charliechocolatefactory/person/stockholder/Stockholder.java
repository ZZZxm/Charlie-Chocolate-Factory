package team.charliechocolatefactory.person.stockholder;

import javafx.scene.Scene;
import team.charliechocolatefactory.person.Person;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Stockholder
 * @description
 * @date 2020/11/7 18:45
 */
public class Stockholder extends Person {

    public Stockholder(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    @Override
    public void moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The stockholder " + this.name + " moves to " + dest.toString());
    }

    @Override
    protected void setInitialAsset() {
        this.asset = 100000;
    }

    @Override
    public String toString() {
        return "class Stockholder extends Person";
    }
}
