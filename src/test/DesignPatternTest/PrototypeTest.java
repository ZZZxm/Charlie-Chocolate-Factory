package test.DesignPatternTest;

import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.rawmaterial.foodmaterial.Egg;
import team.charliechocolatefactory.rawmaterial.packagematerial.Cup;

import java.util.Scanner;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname PrototypeTest
 * @description Test for prototype pattern
 * @date 2020/11/23 18:44
 */
public class PrototypeTest {

    public static void testPrototype(RawMaterial obj1, RawMaterial obj2, String name) {

        System.out.printf("\nNow we check whether the 2 %s instances are the same one: ", name);
        System.out.println(obj1 == obj2);
        System.out.printf("Now we check whether the attributes of the 2 %s instances are the same one: ", name);
        System.out.println(obj1.checkQuantityEqualOnStorage(obj2));
        System.out.printf("Now check whether the value of the attributes in the 2 %s instances are the same: ", name);
        System.out.println(obj1.checkQuantityEqualOnValue(obj2));

        System.out.printf("\nNow we change the quantity of the second %s instance but make its value unchanged.\n", name);
        obj2.acquire(0);

        System.out.print("\nNow we check whether the attributes of the 2 instances are the same one again: ");
        System.out.println(obj1.checkQuantityEqualOnStorage(obj2));
        System.out.print("Now check whether the value of the attributes are the same: ");
        System.out.println(obj1.checkQuantityEqualOnValue(obj2));

    }


    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("------------------------------------ Prototype Test ------------------------------------");

        System.out.println("");
        System.out.println("Cup : clone() :  clone a cup instance");
        System.out.println("Egg : clone() :  clone a cup instance");
        System.out.println("Method named \"clone\" exists in every subclass of RawMaterial");
        System.out.println("");

        System.out.println("");
        System.out.println("*************************** Prototype Test *******************************");
        System.out.println("***                     1. cup (package material)                      ***");
        System.out.println("***                     2. egg (food material)                         ***");
        System.out.println("***                                                                    ***");
        System.out.println("***               Input the object you want to clone.                  ***");
        System.out.println("**************************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();
            switch (op) {
                case 0: {
                    flag = false;
                    break;
                }
                case 1: {
                    System.out.println("\nFirst we create 2 cup instances using prototype pattern: ");
                    Cup cup1 = new Cup(10);
                    Cup cup2 = (Cup) cup1.clone();
                    testPrototype(cup1, cup2, "cup");
                    break;
                }
                case 2: {
                    System.out.println("\nFirst we create 2 egg instances using prototype pattern: ");
                    Egg egg1 = new Egg(10, 10);
                    Egg egg2 = (Egg) egg1.clone();
                    testPrototype(egg1, egg2, "egg");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }
    }
}
