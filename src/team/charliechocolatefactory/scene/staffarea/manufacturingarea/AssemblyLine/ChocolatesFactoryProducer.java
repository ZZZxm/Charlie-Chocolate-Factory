package team.charliechocolatefactory.scene.staffarea.manufacturingarea.assemblyline;

import team.charliechocolatefactory.scene.staffarea.manufacturingarea.assemblyline.*;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesFactoryProducer
 * @description This class is used to obtain our specific chocolate factory
 * @date 2020/11/15 16:40
 */
public class ChocolatesFactoryProducer {

    /**
     * This method is used to obtain our specific chocolate factory
     *
     * @return chocolate factory
     */
    public static ChocolatesMachineAssemblyLine newChocoMachine(String factoryName) {

        if (AssemblyNameConst.ALMOND_CHOCOLATE_FACTORY.equals(factoryName)) {
            return new AlmondChocolateAssemblyLine();
        } else if (AssemblyNameConst.MILK_CHOCOLATE_FACTORY.equals(factoryName)) {
            return new MilkChocolateAssemblyLine();
        } else {
            throw new RuntimeException("factoryName is error");
        }
    }

}