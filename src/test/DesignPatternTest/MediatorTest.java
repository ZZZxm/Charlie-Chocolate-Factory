package test.DesignPatternTest;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.OfficeWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;
import team.charliechocolatefactory.scene.staffarea.Office;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MediatorTest
 * @description MediatorTest
 * @date 2020/11/22 10:14
 */
public class MediatorTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Mediator] Test ------------------------------------");

        System.out.println("");
        System.out.println("GeneralManager : getInstance() : Get the only instance of the general manager " +
                "and create an instance if there's none,");
        System.out.println("Manager : getOfficeManager() : Get the only instance of the office manager " +
                "and create an instance if there's none,");
        System.out.println("");

        System.out.println("Get instance of general manager... ");
        GeneralManager generalManager1 = GeneralManager.getInstance();
        GeneralManager generalManager2 = GeneralManager.getInstance();
        System.out.println("Create an office... ");
        Office office=new Office();
        System.out.println("Get instance of office manager...");
        Manager officeManager=Manager.getOfficeManager();

        System.out.println("Office manager hired three office workers... ");
        officeManager.hireWorker("worker", 18, Person.Sex.MALE, 10);
        officeManager.hireWorker("worker", 20, Person.Sex.FEMALE, 10);
        officeManager.hireWorker("worker", 22, Person.Sex.MALE, 10);


        System.out.println("\nNow the office manager want to dispatch task that general manager dispatch to him to the office workers: ");
        officeManager.dispatchTask();
        System.out.println("\nGet instance of general manager: ");
        officeManager.receiveFeedBack();




    }

}
