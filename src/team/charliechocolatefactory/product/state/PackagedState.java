package team.charliechocolatefactory.product.state;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname PackagedState
 * @description TODO
 * @date 2020/11/21 22:01
 */
public class PackagedState extends ProductState {

    @Override
    public void gotoNextState(Product product) {
        product.setState(new StoriedState());
        System.out.println("From packaged state to storied state. The product is stored.");
    }
}
