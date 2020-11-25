package test.DesignPatternTest;

import team.charliechocolatefactory.product.chocolate.*;
import team.charliechocolatefactory.product.chocolateProduct.chocolatemix.*;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @project chocolateFactory
 * @classname FlyweightTest
 * @description Test for Flyweight
 * @author Ngae Zeh-ghau
 * @date 2020/11/24 23:02
 */
public class FlyweightTest {

    public static void main(String[] args) {
        final String HINT1 = "\n"
                + "*************************** Flyweight Test ****************************\n"
                + "***            <Phase 1: Create an Array of Chocolates>             ***\n"
                + "***                                                                 ***\n"
                + "***            0. Construct ChocolateMix Now                        ***\n"
                + "***            1. AlmondChocolate                                   ***\n"
                + "***            2. DarkChocolate                                     ***\n"
                + "***            3. MatchaChocolate                                   ***\n"
                + "***            4. MilkChocolate                                     ***\n"
                + "***            5. WhiteChocolate                                    ***\n"
                + "***                                                                 ***\n"
                + "***********************************************************************\n";

        final String HINT2 = "\n"
                + "*************************** Flyweight Test ****************************\n"
                + "***                <Phase 2: Compare Instance Refs>                 ***\n"
                + "***                                                                 ***\n"
                + "***                 Input two indexes to compare.                   ***\n"
                + "***           If they are referring the same instance,              ***\n"
                + "***                      \"true\" is printed.                         ***\n"
                + "***                  Else \"false\" is printed.                       ***\n"
                + "***                      Input -1 to quit.                          ***\n"
                + "***                     Index start from 0.                         ***\n"
                + "***                                                                 ***\n"
                + "***********************************************************************\n";


        System.out.println(
                "------------------------------------ [Flyweight] Test ------------------------------------");

        System.out.println("");
        System.out
                .println("ChocolateMix : ChocolateMix(typeList: List<Class<? extendsChocolate>>) : "
                        + "Get an instance of subclass of Chocolate.");
        System.out
                .println("ChocolateMix : at(index: int) : Return the Chocolate instance at index.");
        System.out.println("");
        System.out.println(HINT1);

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        ArrayList<Class<? extends Chocolate>> classes = new ArrayList<>();
        Class<? extends Chocolate> classChosen = null;

        do {
            System.out.print("Enter the option [0 to construct ChocolateMix now]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    classChosen = null;
                    flag = false;
                    break;
                case 1: {
                    classChosen = AlmondChocolate.class;
                    break;
                }
                case 2: {
                    classChosen = DarkChocolate.class;
                    break;
                }
                case 3: {
                    classChosen = MatchaChocolate.class;
                    break;
                }
                case 4: {
                    classChosen = MilkChocolate.class;
                    break;
                }
                case 5: {
                    classChosen = WhiteChocolate.class;
                    break;
                }
                default: {
                    classChosen = null;
                    System.out.println("Invalid Input, Please input again.");
                }
            }
            if (classChosen != null) {
                classes.add(classChosen);
                System.out.println("Added chocolate type:" + classChosen.getSimpleName());
            }
        } while (flag);

        System.out.println("You will see creation of chocolate you selected here.");
        System.out.println("Each type will be displayed AT MOST ONCE:");

        try {
            ChocolateMix chocolateMix = new ChocolateMix(classes);
            System.out.println("ChocolateMix instantiated.");
            System.out.println(HINT2);
            while (true) {
                System.out.print("Enter the indexes [-1 to quit]:");
                int lIndex = input.nextInt();
                if (lIndex == -1) {
                    return;
                }
                int rIndex = input.nextInt();
                if (rIndex == -1) {
                    return;
                }
                System.out.println(chocolateMix.at(lIndex) == chocolateMix.at(rIndex));
            }
        } catch (Exception e) {
            System.out.println("Failed to instantiate ChocolateMix.");
        }

    }


}
