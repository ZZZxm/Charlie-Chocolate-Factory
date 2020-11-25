package team.charliechocolatefactory.product.state;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname ProductState
 * @description TODO Design Pattern --- State
 * @date 2020/11/21 21:59
 */
public abstract class ProductState {

    public abstract void gotoNextState(Product product);
}
