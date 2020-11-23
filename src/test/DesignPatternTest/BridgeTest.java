package test.DesignPatternTest;

import team.charliechocolatefactory.product.Sandwich.Sandwich;
import team.charliechocolatefactory.product.Sandwich.Pure;
import team.charliechocolatefactory.product.Sandwich.Hazelnut;
import team.charliechocolatefactory.product.Sandwich.Liqueur;
import team.charliechocolatefactory.product.chocolate.*;


/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname BridgeTest
 * @description test for Bridge
 * @date 2020/11/23 13：50
 */
public class BridgeTest {
    static public void BridgeTest(){
        System.out.println("桥接模式测试：");
        System.out.println("首先新建一个Sandwich对象……");
        System.out.println("夹心：榛仁");
        Sandwich hazelnut=new Hazelnut();
        System.out.println("新建Chocolate对象……");
        System.out.println("获取夹心巧克力的名字。");
        Chocolate hazelnutMilkChocolate=new MilkChocolate(hazelnut);
        System.out.println("榛仁牛奶巧克力："+hazelnutMilkChocolate.getNameWithSandwich());
        Chocolate hazelnutMatchaChocolate=new MatchaChocolate(hazelnut);
        System.out.println("榛仁抹茶巧克力："+hazelnutMatchaChocolate.getNameWithSandwich()+"\n");

        System.out.println("新建另一个Sandwich对象……");
        System.out.println("夹心：酒心");
        Sandwich liqueur =new Liqueur();
        System.out.println("新建Chocolate对象……");
        System.out.println("获取夹心巧克力的名字。");
        Chocolate liqueurDarkChocolate=new DarkChocolate(liqueur);
        System.out.println("酒心黑巧克力："+liqueurDarkChocolate.getNameWithSandwich());
        Chocolate liqueurWhiteChocolate=new WhiteChocolate(liqueur);
        System.out.println("酒心白巧克力："+liqueurWhiteChocolate.getNameWithSandwich());

    }

    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— Test[Bridge]Pattern —————————————-------------------------------------————");
        System.out.println("Chocolate : Chocolate() : Construct a Chocolate object with a sandwich object as a parameter to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("MilkChocolate : MilkChocolate() : Construct a milk chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("MatchaChocolate : MatchaChocolate() : Construct a matcha chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("WhiteChocolate : WhiteChocolate() : Construct a white chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("BlackChocolate : BlackChocolate() : Construct a black chocolate to achieve decoupling of sandwich from the chocolate itself.");
        System.out.println("");

        BridgeTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
