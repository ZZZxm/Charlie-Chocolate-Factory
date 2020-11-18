package team.charliechocolatefactory.prototype;

import team.charliechocolatefactory.factory.product.MilkChocolate;
import team.charliechocolatefactory.prototype.copy.ChocolateCakeDeepCopy2;
import team.charliechocolatefactory.prototype.material.Agg;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Client
 * @description Client
 * @date 2020/11/15 18:37
 */
public class Client {

    public static void main(String[] args) {
        ChocolateCakeDeepCopy2 deep_copy = new ChocolateCakeDeepCopy2("deep copy", new Agg(), new MilkChocolate());
        Agg agg = deep_copy.getAgg();

        try {
            ChocolateCakeDeepCopy2 copy2 = (ChocolateCakeDeepCopy2) deep_copy.clone();
            System.out.println(agg == copy2.getAgg());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }


}
