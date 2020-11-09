package team.charliechocolatefactory.person.visitor;

import team.charliechocolatefactory.person.Person;

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

    @Override
    protected void setInitialAsset() {
        this.asset = 1000;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }
}
