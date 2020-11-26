package test.DesignPatternTest;

import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.SceneSelector;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import team.charliechocolatefactory.scene.staffarea.Office;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @project chocolateFactory
 * @classname CallbackTest
 * @description Test for Callback.
 * @author Ngae Zeh-ghau
 * @date 2020/11/25 10:25
 */
public class CallbackTest {
    public static void main(String[] args) {
        final String HINT = "\n"
                + "*************************** Callback Test *****************************\n"
                + "***                                                                 ***\n"
                + "*** 0. Quit                                                         ***\n"
                + "*** 1. Find the Location of Scene(s) Which Cost More Than 100       ***\n"
                + "*** 2. Find the Location of Scene(s) Which Are Lagerer Than 100 m^2 ***\n"
                + "*** 3. Find the Location of Scene(s) Containing \"O\"                 ***\n"
                + "***                                                                 ***\n"
                + "***********************************************************************\n";

        System.out.println(
                "------------------------------------ [Callback] Test ------------------------------------");

        System.out.println("");
        System.out.println("SceneSelector : " + 
            "findSubsetSatisfying(scenes: List<Scene>, predicate: Predicate<Scene>)() : " + 
            "Find a subset of scenes which satisfy the predicate.");
        System.out.println("");

        ArrayList<Scene> scenes = new ArrayList<>();
        scenes.add(new Warehouse("Warehouse A", 10000, 100));
        scenes.add(new Office("Office 101", 100, 100));
        scenes.add(new DiningRoom("Dining Room A", 1000, 1000));
        System.out.println("");
        System.out.println("We created the following scenes:");
        System.out.println("Location         Cost        Area");
        System.out.println("---------------------------------");
        System.out.println("Warehouse A      10000       100");
        System.out.println("Office 101       100         100");
        System.out.println("Dining Room A    1000        1000");
        System.out.println(HINT);

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;
        List<Scene> sList = null;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    sList = SceneSelector.findSubsetSatisfying(scenes, (Scene scene) -> {
                        return scene.getCost() > 100;
                    });
                    for (Scene scene : sList) {
                        System.out.println(scene.getLocation());
                    }
                    break;
                }
                case 2: {
                    sList = SceneSelector.findSubsetSatisfying(scenes, (Scene scene) -> {
                        return scene.getArea() > 100;
                    });
                    for (Scene scene : sList) {
                        System.out.println(scene.getLocation());
                    }
                    break;
                }
                case 3: {
                    sList = SceneSelector.findSubsetSatisfying(scenes, (Scene scene) -> {
                        return scene.getLocation().contains("O");
                    });
                    for (Scene scene : sList) {
                        System.out.println(scene.getLocation());
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);

    }
}
