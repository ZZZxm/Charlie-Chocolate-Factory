package test;

import test.DesignPatternTest.*;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname MainTest
 * @description Main class for the test of design patterns
 * @date 2020/11/19 0:43
 */
public class MainTest {

    public static void showList() {
        System.out.println("               ---------------Design Pattern List---------------");
        System.out.println("               **             1 --- Abstract Factory          **");
        System.out.println("               **             2 --- Adapter                   **");
        System.out.println("               **             3 --- Bridge                    **");
        System.out.println("               **             4 --- Builder                   **");
        System.out.println("               **             5 --- Chain of Responsibility   **");
        System.out.println("               **             6 --- Command                   **");
        System.out.println("               **             7 --- Composite                 **");
        System.out.println("               **             8 --- Decorator                 **");
        System.out.println("               **             9 --- Facade                    **");
        System.out.println("               **            10 --- Factory Method            **");
        System.out.println("               **            11 --- Flyweight                 **");
        System.out.println("               **            12 --- Interpreter               **");
        System.out.println("               **            13 --- Iterator                  **");
        System.out.println("               **            14 --- Mediator                  **");
        System.out.println("               **            15 --- Memento                   **");
        System.out.println("               **            16 --- Observer                  **");
        System.out.println("               **            17 --- Prototype                 **");
        System.out.println("               **            18 --- Proxy                     **");
        System.out.println("               **            19 --- Singleton                 **");
        System.out.println("               **            20 --- State                     **");
        System.out.println("               **            21 --- Strategy                  **");
        System.out.println("               **            22 --- Template Method           **");
        System.out.println("               **            23 --- Visitor                   **");
        System.out.println("               **            24 --- Business Delegate         **");
        System.out.println("               **            25 --- Copy on Write             **");
        System.out.println("               **            26 --- Extension                 **");
        System.out.println("               **            27 --- Filter                    **");
        System.out.println("               **            28 --- IOC                       **");
        System.out.println("               **            29 --- Multition                 **");
        System.out.println("               **            30 --- Null Object               **");
        System.out.println("               -------------------------------------------------");
        System.out.print("               Which design pattern do you want to test? [0 to quit]: ");
    }

    public static void main(String[] args) throws Exception{

        boolean flag = true;
        int op;
        String blank;
        Scanner input = new Scanner(System.in);

        while (flag) {
            showList();
            op = input.nextInt();
            System.out.println("\n");

            switch (op){
                case 0:
                    flag = false;
                    break;
                case 1:
                    //AbstractFactoryTest.main(new String[]{});
                    break;
                case 2:
                    //AdapterTest.main(new String[]{});
                    break;
                case 3:
                    //BridgeTest.main(new String[]{});
                    break;
                case 4:
                    //BuilderTest.main(new String[]{});
                    break;
                case 5:
                   //ChainOfResponsibilityTest.main(new String[]{});
                    break;
                case 6:
                    //CommandTest.main(new String[]{});
                    break;
                case 7:
                    //CompositeTest.main(new String[]{});
                    break;
                case 8:
                    //DecoratorTest.main(new String[]{});
                    break;
                case 9:
                    //FacadeTest.main(new String[]{});
                    break;
                case 10:
                    //FactoryMethodTest.main(new String[]{});
                    break;
                case 11:
                    //FlyweightTest.main(new String[]{});
                    break;
                case 12:
                    //InterpreterTest.main(new String[]{});
                    break;
                case 13:
                    //IteratorTest.main(new String[]{});
                    break;
                case 14:
                    //MediatorTest.main(new String[]{});
                    break;
                case 15:
                    //MementoTest.main(new String[]{});
                    break;
                case 16:
                    //ObserverTest.main(new String[]{});
                    break;
                case 17:
                    //PrototypeTest.main(new String[]{});
                    break;
                case 18:
                    //ProxyTest.main(new String[]{});
                    break;
                case 19:
                    SingletonTest.main(new String[]{});
                    break;
                case 20:
                    //StateTest.main(new String[]{});
                    break;
                case 21:
                    StrategyTest.main(new String[]{});
                    break;
                case 22:
                    TemplateMethodTest.main(new String[]{});
                    break;
                case 23:
                    //VisitorTest.main(new String[]{});
                    break;
                case 24:
                    BusinessDelegateTest.main(new String[]{});
                    break;
                case 25:
                    //CopyOnWriteTest.main(new String[]{});
                    break;
                case 26:
                    //ExtensionTest.main(new String[]{});
                    break;
                case 27:
                    //FilterTest.main(new String[]{});
                    break;
                case 28:
                    //MultipateTest.main(new String[]{});
                    break;
                default:
                    System.out.println("Invalid input!");
                    System.out.println("Please input a number of 0-30!");
            }
            System.out.println("\n");
            System.out.println("Enter to continue testing...");
            blank = input.nextLine();
            blank = input.nextLine();
        }

        System.out.println("");
        System.out.println("========= End of Design Patterns Test ==========");
    }

}
