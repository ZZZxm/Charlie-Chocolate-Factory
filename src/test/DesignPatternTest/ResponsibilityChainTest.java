package test.DesignPatternTest;

import team.charliechocolatefactory.machine.processmachine.wrappermachine.WrapperMachine;
import team.charliechocolatefactory.person.GeneralManager;

import java.util.Scanner;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ResponsibilityChainTest
 * @description TODO
 * @date 2020/11/26 00:23
 */
public class ResponsibilityChainTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Chain of Responsibility] Test ------------------------------------");
        System.out.println("");
        System.out.println("FixWorker:setNext(next:FixWorker) : create next link");
        System.out.println("FixWorker:getNext() : get next link");
        System.out.println("FixWorker:handleRequest(breakLevel:int) : The specific process for processing the request");
        System.out.println("|--If the machine can be fixed now, then fixed it.");
        System.out.println("|--If not, pass this task to next repairman, who is more professional.");
        System.out.println("Machine:fix() : Create a repairman processing chain and submit the request");
        System.out.println("to the first repairman of the chain");
        System.out.println("");

        System.out.println("**************************** Chain of Responsibility Test ***************************");
        System.out.println("***                                                                               ***");
        System.out.println("***       0. exit                                                                 ***");
        System.out.println("***       1. generate a low level breakdown and call repairman to fix it          ***");
        System.out.println("***       2. generate a middle level breakdown and call repairman to fix it       ***");
        System.out.println("***       3. generate a high level breakdown and call repairman to fix it         ***");
        System.out.println("***       4. generate a super level breakdown and call repairman to fix it        ***");
        System.out.println("***                                                                               ***");
        System.out.println("*** NOTICE: the breakLevel is used to describe the broken degree of the machine   ***");
        System.out.println("***   -- [1,3] can be fixed by the rookie repairman                               ***");
        System.out.println("***   -- [4,6] can be fixed by the professional repairman                         ***");
        System.out.println("***   -- [7,9] can be fixed by the expert repairman                               ***");
        System.out.println("***   -- [10,+∞) cannot be fixed anymore                                          ***");
        System.out.println("*************************************************************************************");

        WrapperMachine wrapperMachine = new WrapperMachine("PA", "332");
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
                    breakLevel = 10;
                    while (breakLevel > 3) {
                        breakLevel = (int) (Math.random() * 10 + 1);
                    }
                    System.out.println("breakLevel:"+breakLevel);
                    wrapperMachine.notifyBroke(breakLevel);
                    break;
                }
                case 2: {
                    breakLevel = 10;
                    while (breakLevel <= 3 || breakLevel > 6) {
                        breakLevel = (int) (Math.random() * 10 + 1);
                    }
                    System.out.println("breakLevel:"+breakLevel);
                    wrapperMachine.notifyBroke(breakLevel);
                    break;
                }
                case 3:{
                    breakLevel = 1;
                    while (breakLevel < 7||breakLevel>9) {
                        breakLevel = (int) (Math.random() * 10 + 1);
                    }
                    System.out.println("breakLevel:"+breakLevel);
                    wrapperMachine.notifyBroke(breakLevel);
                    break;
                }
                case 4:{
                    breakLevel = 10;
                    System.out.println("breakLevel:"+breakLevel);
                    wrapperMachine.notifyBroke(breakLevel);
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
