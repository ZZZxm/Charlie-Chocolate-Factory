package test.DesignPatternTest;

import team.charliechocolatefactory.machine.qualitytestmachine.qualitytestsystem.QualityInspectionPanel;
import team.charliechocolatefactory.machine.qualitytestmachine.qualitytestsystem.QualityInspectionPanelGroup;
import team.charliechocolatefactory.supplement.monostate.Screen;
import team.charliechocolatefactory.supplement.proxy.PortableBatteryProxy;

import java.util.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


/**
 * @author TT
 * @project chocolateFactory
 * @classname MonostateTest
 * @description TODO
 * @date 2020/11/26 15:17
 */


public class MonostateTest {


    public static void runTest() {
        List<Screen> ScreenList = new ArrayList<Screen>();

        System.out.println("—————————————-------------------------------------———— [Monostate]Test —————————————-------------------------------------————");
        System.out.println("Screen : setContent(String content) : Set the information show on the Screen");
        System.out.println("Screen : showContent() : Show the information");
//        System.out.println("QualityInspectionPanel : add() : Add a element to the list of panel.");
//        System.out.println("QualityInspectionPanel : show() : Show all elements in the list of panel.");
        System.out.println("");

        String choice;

        label:
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("----------------------------Monostate Test---------------------------");
            System.out.println("**      1 --- Create the guard group                               **");
            System.out.println("**      2 --- Make an alert                                        **");
//            System.out.println("**      3 --- Enlarge the existing Group                           **");
//            System.out.println("**      4 --- Show the  QualityTestSystem  structure               **");
            System.out.println("**      # --- Exit                                                 **");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("");

            choice = sc.next();
            int i;
            int j;
            switch (choice) {
                case "1":
                    System.out.print("Input how many guards you want to have：");
                    Scanner reader = new Scanner(System.in);
                    i = reader.nextInt();
                    for (j = 1; j <= i; j++) {
                        Screen screen = new Screen();
                        screen.returnContent();
                        ScreenList.add(screen);

                        System.out.println("Guard" + j + "'s screen: " + screen.getContent());
                    }
                    break;
                case "2":
                    Scanner input = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Input which Guard to make an alert：");
                    try {
                        int guard_num = input.nextInt();
                        if (guard_num > 0 && guard_num <= ScreenList.size() + 1) {
                            System.out.print("Input the alert：");
                            String no = sc1.next();

                            ScreenList.get(guard_num - 1).setContent(no);
                            for (j = 1; j <= ScreenList.size(); j++) {

                                System.out.println("Guard" + j + "'s screen: " + ScreenList.get(guard_num - 1).getContent());
                            }
                        } else {
                            System.out.println("Invalid Input, Please input again.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid Input, Please input again.\n");
                        System.out.println("");
                    }

                    break;
                case "#":
                    break label;
                default:
                    System.out.println("Invalid Input, Please input again.\n");
                    break;
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }


    public static void main(String[] args) {
        MonostateTest.runTest();
    }


}