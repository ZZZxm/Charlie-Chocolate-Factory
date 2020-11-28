package test.DesignPatternTest;

import team.charliechocolatefactory.scene.decorator.*;
import team.charliechocolatefactory.scene.decorator.DecoratorComponent;

import java.util.Scanner;

/**
 * @author TT
 * @project chocolateFactory
 * @classname DecoratorTest
 * @description This is decorator test
 * @date 2020/11/24 19:55
 */
public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Decorator]Pattern —————————————-------------------------------------————");
        System.out.println("please choose the residence you want to build:");
        System.out.println("**              1 --- villa                 **");
        System.out.println("**              2 --- flat                  **");
        DecoratorComponent residence;

        int i;
        while (true) {
            try {
                Scanner reader = new Scanner(System.in);
                i = reader.nextInt();
                if (i == 1) {
                    /*
                     * create a villa without decorations
                     */
                    residence = new Villa();
                    break;
                } else if (i == 2) {
                    /*
                     * create a flat without decorations
                     */
                    residence = new Flat();
                    break;
                } else {
                    System.out.println("Invalid Input, Please input again.\n");
                }
            } catch (Exception e) {
                System.out.print("Invalid Input, Please input again.\n");
            }
        }
        int fh = 0;
        int cac = 0;
        int m = 0;
        while (true) {
            try {
                System.out.println("--------------------Choose options------------------");
                System.out.println("**      1 --- Add an fire hydrant                 **");
                System.out.println("**      2 --- Add a central air condition         **");
                System.out.println("**      3 --- Add a monitor                       **");
                System.out.println("**      4 --- Show the current price of the house **");
                System.out.println("**      5 --- Exit                                **");
                System.out.println("----------------------------------------------------");
                Scanner reader = new Scanner(System.in);
                i = reader.nextInt();

                if (i == 1) {
                    /*
                     * add an fire hydrant
                     */
                    fh++;
                    residence = new FireHydrant(residence);
                } else if (i == 2) {
                    /*
                     * add a central air condition
                     */
                    cac++;
                    residence = new CentralAirCondition(residence);
                } else if (i == 3) {
                    /*
                     * add a monitor
                     */
                    m++;
                    residence = new Monitor(residence);
                } else if (i == 4) {
                    /*
                     * show the current price of the house
                     */
                    System.out.print(residence.getDescription() + ", with ");
                    if (fh > 1) {
                        System.out.print(fh + " fire hydrants");
                        if (cac > 0)
                            System.out.print(", ");
                        if (cac == 0 && m != 0) {
                            System.out.print(", and ");
                        }
                        if (cac != 0 && m == 0) {
                            System.out.print("and ");
                        }
                    } else if (fh == 1) {
                        System.out.print("1 fire hydrant");
                        if (cac > 0)
                            System.out.print(", ");
                        if (cac == 0 && m != 0) {
                            System.out.print(", and ");
                        }
                        if (cac != 0 && m == 0) {
                            System.out.print("and ");
                        }
                    }

                    if (cac > 1) {
                        System.out.print(cac + " central air conditions");
                        if (m > 0) {
                            System.out.print(", and ");
                        }
                    } else if (cac == 1) {
                        System.out.print("1 central air condition");
                        if (m > 0)
                            System.out.print(", and ");
                    }

                    if (m > 1)
                        System.out.print(m + " monitors");
                    else if (m == 1)
                        System.out.print("1 monitor");

                    System.out.println(", the price is " + residence.getBuildCost());
                } else if (i == 5) {
                    fh = 0;
                    cac = 0;
                    m = 0;

                    break;
                } else {
                    System.out.print("Invalid Input, Please input again.\n");
                }
            } catch (Exception e) {
                System.out.print("Invalid Input, Please input again.\n");
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}