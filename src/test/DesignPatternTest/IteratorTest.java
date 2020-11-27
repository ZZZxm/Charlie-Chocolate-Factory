package test.DesignPatternTest;

import team.charliechocolatefactory.machine.processmachine.wrappermachine.WrapperMachine;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.OfficeWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.WorkerIterator.WorkerListIterator;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop.DarkWorkshop;

import java.util.Scanner;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname IteratorTest
 * @description TODO
 * @date 2020/11/26 22:02
 */
public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Iterator] Test ---------------------------------");
        System.out.println("");
        System.out.println("StaffArea:getIterator() : Gets an iterator for an employee created from");
        System.out.println("an aggregate class at the workplace");
        System.out.println("WorkerListIterator:first(): get the first worker.");
        System.out.println("WorkerListIterator:next(): get next worker.");
        System.out.println("WorkerListIterator:hasNext(): to judge whether it has next one.");
        System.out.println("");

        System.out.println("*********************************** Iterator Test ***********************************");
        System.out.println("***                                                                               ***");
        System.out.println("***       0. exit                                                                 ***");
        System.out.println("***       1. Get the first workers in the darkChocolateWorkShop                   ***");
        System.out.println("***       2. Traverse all staff of the staffs in the office                       ***");
        System.out.println("***                                                                               ***");
        System.out.println("*************************************************************************************");

        Scanner input = new Scanner(System.in);
        // create a darkChocolate workshop and add 3 workers.
        DarkWorkshop darkChocolateWorkShop = new DarkWorkshop();
        darkChocolateWorkShop.addWorker(new WorkshopWorker("Anna", 22, Person.Sex.FEMALE, 30, darkChocolateWorkShop));
        darkChocolateWorkShop.addWorker(new WorkshopWorker("Billie", 19, Person.Sex.FEMALE, 40, darkChocolateWorkShop));
        darkChocolateWorkShop.addWorker(new WorkshopWorker("Justin", 24, Person.Sex.MALE, 80, darkChocolateWorkShop));
        WorkerListIterator workerIterator = new WorkerListIterator();
        workerIterator.setWorkerList(darkChocolateWorkShop.getWorkerList());
        Worker firstStaff;

        // create an office and add 3 staffs.
        Office office = new Office();
        WorkerListIterator staffIterator = new WorkerListIterator();
        staffIterator.setWorkerList(office.getWorkerList());
        office.addWorker(new OfficeWorker("Brian", 20, Person.Sex.MALE, 0, office));
        office.addWorker(new OfficeWorker("Kerr", 20, Person.Sex.FEMALE, 500, office));
        office.addWorker(new OfficeWorker("Young", 20, Person.Sex.MALE, 1, office));
        Worker currentStaff;
        boolean flag = true;
        int op;
        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    firstStaff = workerIterator.first();
                    System.out.println(" name: " + firstStaff.getName() + " sex: " + firstStaff.getSex() + " age: "
                            + firstStaff.getAge() + " salary: " + firstStaff.getSalary()  + " department: " + firstStaff.getDepartment());
                    break;
                }
                case 2: {
                    currentStaff = staffIterator.first();
                    while (true) {
                        System.out.println("name: " + currentStaff.getName() + " sex: " + currentStaff.getSex() + " age: "
                                + currentStaff.getAge() + " salary: " + currentStaff.getSalary() + "department: " + currentStaff.getDepartment());
                        if (staffIterator.hasNext()) {
                            currentStaff = staffIterator.next();
                        } else {
                            break;
                        }
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
