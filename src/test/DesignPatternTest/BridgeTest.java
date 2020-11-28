package test.DesignPatternTest;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.product.Sandwich.Hazelnut;
import team.charliechocolatefactory.product.Sandwich.Liqueur;
import team.charliechocolatefactory.product.chocolate.*;

import java.util.Scanner;

/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname BridgeTest
 * @description test for Bridge
 * @date 2020/11/23 13：50
 */
public class BridgeTest {
    static public void bridgeTest() {
        System.out.println("");
        System.out.println("***************************   Bridge Test   ***************************");
        System.out.println("***                 1. 选择夹心类型                                  ***");
        System.out.println("***                 2. 选择巧克力类型                                ***");
        System.out.println("***                 3. 等待桥接完成！                                ***");
        System.out.println("***********************************************************************");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("首先新建一个Sandwich对象……");
        System.out.println("请选择夹心类型：1.榛仁  2.酒心");
        Sandwich sandwich;
        int tmp;
        while (true) {
            try {
                tmp = scanner.nextInt();
                if (tmp == 1) {
                    sandwich = new Hazelnut();
                    System.out.println("选择夹心类型为：榛仁！");
                    break;
                } else if (tmp == 2) {
                    sandwich = new Liqueur();
                    System.out.println("选择夹心类型为：酒心！");
                    break;
                } else {
                    System.out.println("请选择夹心类型:1.榛仁  2.酒心");
                }
            } catch (Exception e) {
                System.out.println("请重新选择夹心类型。");
            }
        }
        System.out.println("新建Chocolate对象……");
        int cmd;
        while (true) {
            try {
                System.out.println("");
                System.out.println("选择你想放入的巧克力。");
                System.out.println("1.牛奶巧克力  2.抹茶巧克力  3.黑巧克力  4.白巧克力  5.退出测试");
                cmd = scanner.nextInt();
                System.out.println("获取夹心巧克力的名字:");
                Chocolate SandwichChocolate;
                if (cmd == 1) {
                    SandwichChocolate = new MilkChocolate(sandwich);
                    System.out.println(SandwichChocolate.getNameWithSandwich());
                } else if (cmd == 2) {
                    SandwichChocolate = new MatchaChocolate(sandwich);
                    System.out.println(SandwichChocolate.getNameWithSandwich());
                } else if (cmd == 3) {
                    SandwichChocolate = new DarkChocolate(sandwich);
                    System.out.println(SandwichChocolate.getNameWithSandwich());
                } else if (cmd == 4) {
                    SandwichChocolate = new WhiteChocolate(sandwich);
                    System.out.println(SandwichChocolate.getNameWithSandwich());
                } else if (cmd == 5) {
                    break;
                } else {
                    System.out.println("输入指令无效，请重新输入。");
                }
            } catch (Exception e) {
                System.out.println("输入指令无效，请重新输入。");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Bridge]Pattern —————————————-------------------------------------————");
        System.out.println("Chocolate : Chocolate() : Construct a Chocolate object with a sandwich object as a parameter to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("MilkChocolate : MilkChocolate() : Construct a milk chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("MatchaChocolate : MatchaChocolate() : Construct a matcha chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("WhiteChocolate : WhiteChocolate() : Construct a white chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("BlackChocolate : BlackChocolate() : Construct a black chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("");

        bridgeTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
