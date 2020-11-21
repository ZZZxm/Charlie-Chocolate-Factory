package team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.procucer;

import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.AlmondChocolateAssemblyLine;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.ChocolatesMachineAssemblyLine;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.MilkChocolateAssemblyLine;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.AssemblyLine.projectConst.FactoryNameCounst;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesFactorProcucer
 * @description This class is used to obtain our specific chocolate factory
 * @date 2020/11/15 16:40
 */
public class ChocolatesFactorProcucer {

    /**
     * This method is used to obtain our specific chocolate factory
     * @return chocolate factory
     */
    public static ChocolatesMachineAssemblyLine newChocoMachine(String factoryName){

        if (FactoryNameCounst.ALMOND_CHOCOLATE_FACTORY.equals(factoryName)){
            return new AlmondChocolateAssemblyLine();
        }else if (FactoryNameCounst.MILK_CHOCOLATE_FACTORY.equals(factoryName)){
            return new MilkChocolateAssemblyLine();
        }else {
            throw new RuntimeException("factorName is error");
        }
    }

}
