package team.charliechocolatefactory.machine.workshop;


import team.charliechocolatefactory.machine.processmachine.productmachine.ProductMachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname Workshop
 * @description This is the basic class of all the workshops, a workshop produces a family of products.
 * @date 2020/11/13 15:42
 */
public abstract class Workshop {
    public ProductMachine productMachine;
    public Workshop(){}

    /**
     * produce product 1 of the production family: Chocolate
     * @return a int
     */
    public abstract int produceChocolate();

    /**
     * produce product 2 of the production family: ChocolateCookie
     * @return a int
     */
    public abstract int produceChocolateCookie();
    public String toString() {
        return "class Workshop";
    }
}
