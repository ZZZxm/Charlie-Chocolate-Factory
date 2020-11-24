package test;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.rawmaterial.packagematerial.Cup;
import team.charliechocolatefactory.scene.staffarea.Office;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Test
 * @description TODO
 * @date 2020/11/22 13:37
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cup cup = new Cup();
        Cup cup1 =(Cup) cup.clone();

        System.out.println(cup == cup1);
        System.out.println(cup.equals(cup1));
    }
}
