package test.DesignPatternTest;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.visitor.Visitor;
import team.charliechocolatefactory.person.visitor.VisitorBO;

import java.util.List;
import java.util.Scanner;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname TransferObjectTest
 * @description TODO
 * @date 2020/11/27 20:21
 */
public class TransferObjectTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Transfer] Test ------------------------------------");
        System.out.println("");
        System.out.println("VisitorBO:getInstance(): get the visitorBO");
        System.out.println("VisitorBO:addVisitor(Visitor visitor) : add visitor to the database");
        System.out.println("VisitorBO:deleteVisitor(Visitor visitor): delete visitor to the database");
        System.out.println("VisitorBO:getAllVisitors(): get all the visitors(return a visitor list)");
        System.out.println("VisitorBO:updateVisitor(Visitor visitor): update the visitor's name");
        System.out.println("");

        System.out.println("************************************* Transfer Test *********************************");
        System.out.println("***                                                                               ***");
        System.out.println("***       0. exit                                                                 ***");
        System.out.println("***       1. get all visitors and show them                                       ***");
        System.out.println("***                 (In the initial case， there are 3 visitors in the list)      ***");
        System.out.println("***       2. add a visitor to the database                                        ***");
        System.out.println("***       3. update the visitor's name                                            ***");
        System.out.println("***       4. delete the visitor                                                   ***");
        System.out.println("***                                                                               ***");
        System.out.println("*************************************************************************************");

        VisitorBO visitorBO = VisitorBO.getInstance();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int breakLevel = 0;
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
                    List<Visitor> visitorList = visitorBO.getAllVisitors();
                    int i = 1;
                    System.out.println("all the visitors are shown below:");
                    for (Visitor visitor : visitorList) {
                        System.out.println("visitor" + i + " " + visitor.getName() + " " + visitor.getAge() + " years old, " + visitor.getSex());
                        i++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Please input the name of the new visitor:");
                    String name = input.next();
                    System.out.println("Please input the age of the new visitor:");
                    int age = input.nextInt();
                    Visitor visitor1 = new Visitor(name, age, Person.Sex.MALE);
                    while(true){
                        System.out.println("Please input the sex of the new visitor(m/f):");
                        String sex = input.next();
                        if(sex.equals("m")){
                            visitor1.setSex(Person.Sex.MALE);
                            break;
                        }else if(sex.equals("f")){
                            visitor1.setSex(Person.Sex.FEMALE);
                            break;
                        }else{
                            System.out.println("No such sex choice, please check and input again");
                        }
                    }
                    visitorBO.addVisitor(visitor1);
                    System.out.println("the new visitor is successfully added to the database!");
                    break;
                }
                case 3: {
                    System.out.println("which visitor do you want to modify, please input a visitorCode");
                    int code = input.nextInt();
                    code--;
                    if (visitorBO.getAllVisitors().size() > code) {
                        System.out.println("please input the name you want it to be.");
                        String name = input.next();
                        Visitor visitor1 = new Visitor(name, 0, Person.Sex.MALE, code);
                        visitorBO.updateVisitor(visitor1);
                    } else {
                        System.out.println("no such visitCode!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("which visitor do you want to delete, please input a visitorCode");
                    int code = input.nextInt();
                    code--;
                    if (visitorBO.getAllVisitors().size() > code) {
                        visitorBO.deleteVisitor(code);
                        System.out.println("the NO." + code + " visitor is successfully deleted to the database!");
                    } else {
                        System.out.println("no such visitCode!");
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
