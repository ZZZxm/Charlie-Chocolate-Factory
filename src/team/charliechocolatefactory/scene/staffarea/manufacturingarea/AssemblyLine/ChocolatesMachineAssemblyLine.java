package team.charliechocolatefactory.scene.staffarea.manufacturingarea.assemblyline;

import team.charliechocolatefactory.product.chocolate.Chocolate;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesMachineAssemblyLine
 * @description abstract assembly line class of chocolate factory
 * @date 2020/11/15 16:26
 */
public abstract class ChocolatesMachineAssemblyLine {

    /**
     * Return the corresponding product,
     * that is, chocolate, and how to implement it to the subclass
     * @return Chocolate for Factory;
     */
    public abstract Chocolate getChocolate();

}
