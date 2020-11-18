package team.charliechocolatefactory.person.visitor;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.visitor.limit.Context;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.publicarea.PublicArea;


/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Visitor
 * @description visitors of the chocolate factory, who can visit the exhibition hall and the exploration hall
 * @date 2020/11/7 18:26
 */
public class Visitor extends Person {

    public String identity="visitor";

    public Visitor(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    /**
     * visit a public area
     * However, a visitor can only be allowed to visit some place when it is not full.
     * @param dest destination
     */
    public boolean visit(PublicArea dest) {
        if(!dest.isFull()) {
            System.out.println("Visitor " + this.name + "visits" + dest.toString());
            this.moveTo(dest);
            return true;
        }
        else {
            System.out.println("Sorry, the" + dest.toString() + "is already full.");
            return false;
        }
    }

    /**
     * Visitor can only visit the public areas.
     * @param dest destination
     */
    @Override
    public boolean moveTo(Scene dest) {
       /* if(dest instanceof PublicArea) {
            this.location = dest;
            System.out.println("Visitor" + this.name + "moves to " + dest.toString());
            return true;
        } else {
            System.out.println("Sorry, visitor " +this.name + "can't go to" + dest.toString());
            return false;
        }*/
        Context visit=new Context();
        String move="visitor enter "+dest.toString();
        if(visit.canEnter(move)) {
            this.location = dest;
            System.out.println("Visitor" + this.name + "moves to " + dest.toString());
            return true;
        } else {
            System.out.println("Sorry, visitor " +this.name + "can't go to" + dest.toString());
            return false;
        }
    }

    /**
     * set the initial asset of the visitor;
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 1000;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }
}
