package test.DesignPatternTest;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;
import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.machine.transportmachine.UAVs.Adapter;
import team.charliechocolatefactory.machine.transportmachine.UAVs.UAV;

import java.util.Scanner;

/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname AdapterTest
 * @description test for Adapter
 * @date 2020/11/23 13：30
 */
public class AdapterTest {
    static public void adapterTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("***************************   Adapter Test   **************************");
        System.out.println("***                 1. 创建一个无人机对象                             ***");
        System.out.println("***                 2. 设置无人机属性                                 ***");
        System.out.println("***                 3. 无人机开始工作！                               ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        System.out.println("请为该架无人机设置机器编号（ID）:");
        String machineNum = scanner.nextLine();
        System.out.println("请以此输入该机器使用年限、lossCoefficient(0~1之间的小数)、最大容量（以空格为终止符）。");
        double lifeYear = scanner.nextDouble();
        double lossCoefficient = scanner.nextDouble();
        int maxCapacity = scanner.nextInt();
        TransportMachine transportMachine = new TransportMachine("TR", machineNum, lifeYear, lossCoefficient, maxCapacity) {
            @Override
            protected void load(Product product) {
            }

            @Override
            protected void arrive(Product product) {
            }
        };

        UAV uav = new Adapter(transportMachine);
        uav.setAimProcessNum(1);
        uav.setID(transportMachine.getMachineID());
        System.out.println("无人机的机器编号为：" + uav.getID());

        System.out.println("");
        Product product = new Product("product", 5, 5) {
            @Override
            protected void initIngredientList() {
            }
        };

        System.out.println("无人机开始工作……");
        uav.work(product);
    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Adapter]Pattern —————————————-------------------------------------————");
        System.out.println("Adapter : work() : Use adapter to implement work function in UAV.");
        System.out.println("Adapter : navigate() : Use adapter to implement navigate function in UAV.");
        System.out.println("Machine : work() : Abstract work function in Machine base class.");
        System.out.println("UAV : work() : Interface that UAV should have work function.");
        System.out.println("UAV : navigate() : Interface that UAV should have navigate function.");
        System.out.println("");

        adapterTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
