package test.DesignPatternTest;

import team.charliechocolatefactory.scene.publicarea.ExperienceRoom;
import team.charliechocolatefactory.supplement.handmadetool.HandmadeToolFactory;

import java.util.Scanner;

/**
 * @project chocolateFactory
 * @classname COWTest
 * @description Test for COW
 * @author Ngae Zeh-ghau
 * @date 2020/11/25 00:29
 */
public class COWTest {
    public static void main(String[] args) {

        final String HINT = "\n"
                + "************************* Copy on Write Test **************************\n"
                + "***                                                                 ***\n"
                + "***            0. Quit                                              ***\n"
                + "***            1. Display the Ref Count of Defalut Tool             ***\n"
                + "***            2. Modify Tool Description in Room 0                 ***\n"
                + "***            3. Modify Tool Description in Room 1                 ***\n"
                + "***            4. Display Tool Batch Number in Room 0               ***\n"
                + "***            5. Display Tool Batch Number in Room 1               ***\n"
                + "***                                                                 ***\n"
                + "***Tips: If you triggered Copy on Write, a line of\"Copy Handmade    ***\n"
                + "***Tool!\" will be printed.                                          ***\n"
                + "***********************************************************************\n";


        System.out.println(
                "------------------------------------ [Copy on Write] Test ------------------------------------");

        System.out.println("");
        System.out.println("HandmadeTool : getBatchNumber() : Get batch number.");
        System.out.println("HandmadeTool : getRefCount() : Get reference counter.");
        System.out.println(
                "HandmadeToolFactory : getDefaultHandmadeTool() : Get default instance of HandmadeTool.");
        System.out.println(
                "ExperienceRoom : getTool() : Get instance of HandmadeTool in this ExperienceRoom.");
        System.out.println(
                "ExperienceRoom: setToolDescription(description: String): Set the description of the tool.");
        System.out.println("");
        System.out.println(HINT);

        ExperienceRoom[] experienceRooms = new ExperienceRoom[2];
        experienceRooms[0] = new ExperienceRoom();
        experienceRooms[1] = new ExperienceRoom();

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println(HandmadeToolFactory.getDefaultHandmadeTool().getRefCount());
                    break;
                }
                case 2: {
                    experienceRooms[0].setToolDescription("New Description for 0.");
                    System.out.println("Tool description modified in room 0.");
                    break;
                }
                case 3: {
                    experienceRooms[1].setToolDescription("New Description for 1.");
                    System.out.println("Tool description modified in room 1.");
                    break;
                }
                case 4: {
                    System.out.println(experienceRooms[0].getTool().getBatchNumber());
                    break;
                }
                case 5: {
                    System.out.println(experienceRooms[1].getTool().getBatchNumber());
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}
