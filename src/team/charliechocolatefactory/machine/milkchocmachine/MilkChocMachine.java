package team.charliechocolatefactory.machine.milkchocmachine;

import team.charliechocolatefactory.machine.processmachine.productmachine.BasicProductMachine;
import team.charliechocolatefactory.product.chocolate.MilkChocolate;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname DarkChocMachine
 * @description This machine produces milk chocolate with different concentrations of components.
 * @date 2020/11/14 10:09
 */
public abstract class MilkChocMachine extends BasicProductMachine {
    protected MilkChocolate milkChocolate;

    public MilkChocMachine() {
        super("MilkChocMachine", "000");
        milkChocolate = new MilkChocolate();
    }

    /**
     * to get product
     *
     * @return a MilkChocolate
     */
    public MilkChocolate getMilkChocolate() {
        return milkChocolate;
    }

    /**
     * set the amount of chocolate in the product
     */
    public abstract void useCocoaBean();

    /**
     * set the amount of sugar in the product
     */
    public abstract void useSugar();

    /**
     * set the amount of milk in the product
     */
    public abstract void useMilk();

    public String toString() {
        return "class MilkChocMachine";
    }
}
