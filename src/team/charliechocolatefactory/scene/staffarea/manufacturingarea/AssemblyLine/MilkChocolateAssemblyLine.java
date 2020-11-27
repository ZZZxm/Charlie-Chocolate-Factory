package team.charliechocolatefactory.scene.staffarea.manufacturingarea.assemblyline;

import team.charliechocolatefactory.product.chocolate.Chocolate;
import team.charliechocolatefactory.product.chocolate.MilkChocolate;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname MilkChocolateAssemblyLine
 * @description assembly line for milk chocolate
 * @date 2020/11/15 16:46
 */
public class MilkChocolateAssemblyLine extends ChocolatesMachineAssemblyLine {

    /**
     * Specific return, milk chocolate factory can only return milk chocolate
     * @return  MilkChocolate;
     */
    @Override
    public Chocolate getChocolate() {
        return new MilkChocolate();
    }
}
