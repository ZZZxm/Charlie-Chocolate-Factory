package test.DesignPatternTest;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.visitor.Visitor;

import java.util.Scanner;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname InterpreterTest
 * @description TODO
 * @date 2020/11/27 00:23
 */
public class InterpreterTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Interpreter] Test ---------------------------------");
        System.out.println("");
        System.out.println("Terminal Expression:interpret(info:String): to judge whether the string is a terminal symbol.");
        System.out.println("|--[parameter] info: the string being analysed.(e.g. \"sb. enter somewhere\")");
        System.out.println("AndExpression:interpret(info:String): Determines whether the string being analyzed is the");
        System.out.println("identity that meets the criteria or the region that meets the criteria.");
        System.out.println("Context:canEnter(info:String): invoke AndExpression.interpret() to explain the string which is analysed.");
        System.out.println("|--[parameter] info: the string being analysed.(e.g. \"sb. enter somewhere\")");
        ;
        System.out.println("Visitor:moveTo(dest:Scene): Create a Context object internally that indirectly accesses the interpreter's");
        System.out.println("interpretation method to determine whether a person can enter an area.");
        System.out.println("|--[parameter] dest: the destination");
        System.out.println("");

        System.out.println("*********************************** Interpreter Test ********************************");
        System.out.println("***                                                                               ***");
        System.out.println("***       0. exit                                                                 ***");
        System.out.println("***       1. enter a string to check whether it's allowed                         ***");
        System.out.println("***                                                                               ***");
        System.out.println("*** NOTICE: the person and scenes can be chosen from below:                       ***");
        System.out.println("*** |-- person:                                                                   ***");
        System.out.println("***     |-- visitor: create it yourself!                                          ***");
        System.out.println("***     |-- general manager                                                       ***");
        System.out.println("*** |-- scenes:                                                                   ***");
        System.out.println("***     |-- public area                                                           ***");
        System.out.println("***     |-- dark chocolate work                                                   ***");
        System.out.println("***     |-- exhibition room                                                       ***");
        System.out.println("***     |-- office                                                                ***");
        System.out.println("***     |-- experience room                                                       ***");
        System.out.println("***     |-- white chocolate work                                                  ***");
        System.out.println("*************************************************************************************");

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int op;

        Visitor visitor;
        System.out.println("Please create a visitor first.");
        System.out.println("Give him/her a name: ");
        String name = input.next();
        System.out.println("How old?");
        int age = input.nextInt();
        visitor = new Visitor(name, age, Person.Sex.MALE);

        boolean sexFlag = true;
        while (sexFlag) {
            System.out.println("Male or Female?(m/f)");
            String sex = input.next();
            switch (sex) {
                case "m":
                    visitor.setSex(Person.Sex.MALE);
                    sexFlag = false;
                    break;
                case "f":
                    visitor.setSex(Person.Sex.FEMALE);
                    sexFlag = false;
                    break;
                default:
                    System.out.println("No such sex choice, please check and input again!");
            }
        }
        System.out.println("Now we have a visitor named " + visitor.getName() + ", " + visitor.getSex() + ", " + visitor.getAge() + " years old.");

        String inputSentence;
        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("please input a sentence in this template: sb->somewhere");
                    System.out.println("sb can be generalManager or " + visitor.getName());
                    System.out.println("somewhere can be:");
                    System.out.println("    |-- publicArea");
                    System.out.println("    |-- darkChocolateWorkshop");
                    System.out.println("    |-- exhibitionRoom");
                    System.out.println("    |-- office");
                    System.out.println("    |-- experienceRoom");
                    System.out.println("    |-- whiteChocolateWorkshop");
                    inputSentence = input.next();
                    String s[] = inputSentence.split("->");
                    if (visitor.getName().equals(s[0])) {
                        visitor.canEnter(s[1]);
                    } else if ("generalManager".equals(s[0])) {
                        System.out.println("general manager can enter " + s[1]);
                    } else {
                        System.out.println("no such people!");
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
