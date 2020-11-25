package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.Stockholder;
import team.charliechocolatefactory.person.filterchain.FilterManager;
import team.charliechocolatefactory.person.filterchain.message.Message;
import team.charliechocolatefactory.person.filterchain.message.ResignationMessage;
import team.charliechocolatefactory.person.staff.Manager;

import java.util.Scanner;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname FilterTest
 * @description Test for filter pattern
 * @date 2020/11/23 20:17
 */
public class FilterTest {

    public static void main(String[] args) {

        System.out.println("------------------------------------ [Filter] Test ------------------------------------");

        System.out.println("");
        System.out.println("FilterManager : doFilterMessage(message: Message) : start the message sending process");
        System.out.println("FilterManager : addPersonProcess(person: Person) : add one person to the handling process");
        System.out.println("Person : HandleRequest(requestMessage: Message) : current leader handles the request");
        System.out.println("");
        System.out.println("");
        System.out.println("************************************ Filter Test **************************************");
        System.out.println("***                                                                                 ***");
        System.out.println("***                               Here are some tips:                               ***");
        System.out.println("***    Manager will reject requests starting with 'M'                               ***");
        System.out.println("***    General manager will reject requests starting with 'G'                       ***");
        System.out.println("***    Stockholder will reject requests starting with 'S'                           ***");
        System.out.println("***    Order of handling the request is Manager -> General Manager > Stockholder    ***");
        System.out.println("***************************************************************************************");
        System.out.println("");

        System.out.println("\nNow create the three leaders.");
        FilterManager filterManager = new FilterManager();
        GeneralManager generalManager = GeneralManager.getInstance();
        Manager manager = Manager.getWorkShopManager();
        Stockholder stockholder = new Stockholder("Brian", 21, Person.Sex.MALE);

        System.out.println("\nNow put the leaders into the process.");
        boolean addManager = filterManager.addPersonProcess(manager);
        if (addManager) {
            System.out.println("Manager has been added to the process successfully.");
        } else {
            System.out.println("Manager failed to be added to the process.");
        }

        boolean addGeneralManager = filterManager.addPersonProcess(generalManager);
        if (addGeneralManager) {
            System.out.println("General manager has been added to the process successfully.");
        } else {
            System.out.println("General manager failed to be added to the process.");
        }

        boolean addStockholder = filterManager.addPersonProcess(stockholder);
        if (addStockholder) {
            System.out.println("Stockholder has been added to the process successfully.");
        } else {
            System.out.println("Stockholder failed to be added to the process.");
        }

        Scanner input = new Scanner(System.in);
        String msgContent;
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.println("Input the content of the message ['quit' to quit]: ");
            msgContent = input.nextLine();
            if (msgContent.equals("quit")) {
                flag = false;
            }
            else if (msgContent.equals("")) {
                System.out.println("The content cannot be an empty string. Please input again.");
            }
            else
            {
                System.out.printf("%nNow create a massage whose content is \"%s\".%n", msgContent);
                Message msg = new ResignationMessage(msgContent);
                System.out.println("The message has been created and here is the content: " + msg.getMessageInfo());

                System.out.println("\nNow start handling the process.");
                filterManager.doFilterMessage(msg);
            }

        }
    }

}
