package team.charliechocolatefactory.product.state;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname StoriedState
 * @description TODO
 * @date 2020/11/21 22:01
 */
public class StoriedState extends ProductState {
    @Override
    public void gotoNextState(Product product) {
        System.out.println("The product has been storied.");
    }

    @Override
    public String toString() {
        return "storied state";
    }
}
