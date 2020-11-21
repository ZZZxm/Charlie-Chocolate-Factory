package team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.procucer;

import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.AlmondChocolateAssemblyLine;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.ChocolatesMachineAssemblyLine;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.MilkChocolateAssemblyLine;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesFactorProducer
 * @description This class is used to obtain our specific chocolate factory
 * @date 2020/11/15 16:40
 */
public class ChocolatesFactorProducer {

    /**
     * This method is used to obtain our specific chocolate factory
     * @return chocolate factory
     */
    public static ChocolatesMachineAssemblyLine newChocoMachine(String factoryName){

        if (team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.projectConst.FactoryNameConst.ALMOND_CHOCOLATE_FACTORY.equals(factoryName)){
            return new AlmondChocolateAssemblyLine();
        }else if (team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.projectConst.FactoryNameConst.MILK_CHOCOLATE_FACTORY.equals(factoryName)){
            return new MilkChocolateAssemblyLine();
        }else {
            throw new RuntimeException("factorName is error");
        }
    }

}
