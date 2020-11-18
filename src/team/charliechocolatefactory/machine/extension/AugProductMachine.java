package team.charliechocolatefactory.machine.extension;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname AugProductMachine
 * @description This class expands the function of the original production machine so that it can produce continuously.
 * @date 2020/11/18 21:44
 */
public class AugProductMachine implements MachineExtension{

    private BasicProductMachine productMachine;

    public AugProductMachine(BasicProductMachine productMachine) {
        this.productMachine = productMachine;
    }

    /**
     * continuous production
     * @param workNum
     * @param product
     * @return a int representing output
     */
    @Override
    public int continueWork(int workNum, Product product) {
        int outNum=0;
        for(int i = 0; i<workNum; ++i)
        {
            int output=productMachine.run(product);
            System.out.println("Run"+i+": the machine produced "+outNum+" products");
            outNum=output+outNum;
            if(output==0) break;
        }
        System.out.println("After continuous work, the machine produced a total of "+outNum+" products");
        return outNum;
    }

    /**
     * provide machine fix interface in case of machine failure in continuous production
     */
    public void fix()
    {
        productMachine.fix();
    }

    public String toString() {
        return "class AugProductMachine";
    }
}
