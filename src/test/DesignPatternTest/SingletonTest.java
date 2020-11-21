package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname SingletonTest
 * @description Test for Singleton
 * @date 2020/11/19 1:28
 */
public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Singleton] Test ------------------------------------");

        System.out.println("");
        System.out.println("GeneralManager : getInstance() : Get the only instance of the general manager " +
                "and create an instance if there's none,");
        System.out.println("");

        System.out.println("The first time to get instance of general manager: ");
        GeneralManager generalManager1 = GeneralManager.getInstance();
        System.out.println("");
        System.out.println("The next time to get instance of general manager: ");
        GeneralManager generalManager2 = GeneralManager.getInstance();

    }
}
