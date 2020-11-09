package team.charliechocolatefactory.person.visitor;

import javafx.scene.Scene;
import team.charliechocolatefactory.person.Person;

import java.security.PublicKey;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Visitor
 * @description visitors of the chocolate factory, who can visit the exhibition hall and the exploration hall
 * @date 2020/11/7 18:26
 */
public class Visitor extends Person {

    public Visitor(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    public void visit(PublicArea dest) {
        System.out.println("Visitor " + this.name + "visits" + dest.toString());
    }


    @Override
    public void moveTo(Scene dest) {
        if(dest instanceof PublicArea) {
            this.location = dest;
            System.out.println("Visitor" + this.name + "moves to " + dest.toString());
        } else {
            System.out.println("Sorry, visitor " +this.name + "can't go to" + dest.toString());
        }
    }

    @Override
    protected void setInitialAsset() {
        this.asset = 1000;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }
}
