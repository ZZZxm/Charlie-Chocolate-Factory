package test.DesignPatternTest;

import team.charliechocolatefactory.rawmaterial.foodmaterial.Egg;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseClient;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Delegate.WarehouseDelegate;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.warehouse.Warehouse;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname TestTemplate
 * @description TODO
 * @date 2020/11/24 16:00
 */
public class TestTemplate {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Design Name] Test ------------------------------------");

        System.out.println("");
        System.out.println("ClassName : Function(param: paramType) : function introduction");
        System.out.println("");

        System.out.println("");
        System.out.println("******************* (Your Design Pattern Name) Test *******************");
        System.out.println("***                 1. order1                                       ***");
        System.out.println("***                 2. order2                                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***Tips: 给用户的一些使用提示                                         ***");
        System.out.println("***********************************************************************");
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
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}
