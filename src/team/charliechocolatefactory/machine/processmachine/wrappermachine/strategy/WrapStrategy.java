package team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WrapStrategy
 * @description TODO Design Pattern --- StrategyTest
 * abstract class of the wrap strategy, each kind of wrap strategy must implement it.
 * @date 2020/11/13 21:17
 */
public abstract class WrapStrategy {

    public abstract void packaging(Product product);
}
