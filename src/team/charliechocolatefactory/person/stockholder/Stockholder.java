package team.charliechocolatefactory.person.stockholder;

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
    protected void setInitialAsset() {

    }

    @Override
    public String toString() {
        return "class Stockholder extends Person";
    }
}
