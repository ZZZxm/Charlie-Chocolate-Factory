package team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine;


import team.charliechocolatefactory.product.chocolate.AlmondChocolate;
import team.charliechocolatefactory.product.chocolate.Chocolate;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname AlmondChocolateFactory
 * @description AlmondChocolateFactory
 * @date 2020/11/15 16:46
 */
public class AlmondChocolateAssemblyLine extends ChocolatesMachineAssemblyLine {

    /**
     * Specific return, milk chocolate factory can only return almond chocolate
     * @return  MilkChocolate;
     */
    @Override
    public Chocolate getChocolate() {
        return new AlmondChocolate();
    }
}
