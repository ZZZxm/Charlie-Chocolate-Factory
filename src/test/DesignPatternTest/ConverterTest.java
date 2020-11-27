package test.DesignPatternTest;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;
import team.charliechocolatefactory.person.visitor.Visitor;
import team.charliechocolatefactory.person.visitor.converter.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname ConverterTest
 * @description ConverterTest
 * @date 2020/11/26 15:02
 */
public class ConverterTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Converter] Test ------------------------------------");

        System.out.println("");
        System.out.println("VisitorConverter : batchConverterFromDto : convert all dto visitors to visitors.");
        System.out.println("Product : producing : Transmit the command to a specific machine .");
        System.out.println("");

        List<Visitor> visitors = new ArrayList<>();
        List<VisitorDto> dtoVisitors = new ArrayList<>();
        String name;
        int age;
        Person.Sex sex;
        System.out.println("Create an visitorConverter...");
        Converter<VisitorDto, Visitor> visitorConverter = new VisitorConverter();

        System.out.println("");
        System.out.println("*******************             Converter Test            ******************");
        System.out.println("***                 1. create a visitor entity                           ***");
        System.out.println("***                 2. create a dto visitor                              ***");
        System.out.println("***                 3. convert all visitors to dto visitors              ***");
        System.out.println("***                 4. convert all dto visitors to visitors              ***");
        System.out.println("***Tips: When execute 1 or 2,please enter the person's name age and sex  ***");
        System.out.println("***      which are separated by spaces and the sex type is MALE/FEMALE   ***");
        System.out.println("****************************************************************************");
        System.out.println("");

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
                    System.out.println("Please enter the information of a visitor:name,age and sex(MALE/FEMALE)");
                    name = input.next();
                    age = input.nextInt();
                    sex = Person.Sex.valueOf(input.next());
                    visitors.add(new Visitor(name, age, sex));
                    System.out.println("Successfully add a visitor.\n");
                    break;
                }
                case 2: {
                    System.out.println("Please enter the information of a dto visitor:name,age and sex(MALE/FEMALE)");
                    name = input.next();
                    age = input.nextInt();
                    sex = Person.Sex.valueOf(input.next());
                    dtoVisitors.add(new VisitorDto(name, age, sex));
                    System.out.println("Successfully add a visitorDto.\n");
                    break;
                }
                case 3: {
                    if (visitors.isEmpty()) {
                        System.out.println("Please create some dto visitors");
                    } else {
                        dtoVisitors = visitorConverter.batchConverterFromEntities(visitors);
                        visitors.forEach((visitor) -> System.out.println(visitor.getName() + " " + visitor.getAge() + " " + visitor.getSex()));
                    }
                    break;
                }
                case 4: {
                    if (dtoVisitors.isEmpty()) {
                        System.out.println("Please create some visitors");
                    } else {
                        visitors = visitorConverter.batchConverterFromDto(dtoVisitors);
                        dtoVisitors.forEach((dtoVisitor) -> System.out.println(dtoVisitor.getName() + " " + dtoVisitor.getAge() + " " + dtoVisitor.getSex()));
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
