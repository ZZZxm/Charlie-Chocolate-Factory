package team.charliechocolatefactory.product.state;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname ProducedState
 * @description TODO
 * @date 2020/11/21 22:01
 */
public class ProducedState extends ProductState {
    @Override
    public void gotoNextState(Product product) {
        product.setState(new PackagingState());
        System.out.println("From produced state to packaging state. Start packaging...");
    }

    @Override
    public String toString() {
        return "produced state";
    }
}
