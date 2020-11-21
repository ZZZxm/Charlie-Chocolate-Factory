package team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine;
import team.charliechocolatefactory.product.chocolate.Chocolate;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesMachineFactory
 * @description The chocolate factory, inherited from the top factory
 * @date 2020/11/15 16:26
 */
public abstract class ChocolatesMachineAssemblyLine extends MachineAssemblyLine {

    /**
     * Return the corresponding product,
     * that is, chocolate, and how to implement it to the subclass
     * @return Chocolate for Factory;
     */
    public abstract Chocolate getChocolate();

}
