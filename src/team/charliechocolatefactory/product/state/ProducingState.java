package team.charliechocolatefactory.product.state;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname ProducingState
 * @description TODO
 * @date 2020/11/21 22:00
 */
public class ProducingState extends ProductState {

    @Override
    public void gotoNextState(Product product) {
        product.setState(new ProducedState());
        System.out.println("From producing state to produced state, waiting for packaging.");
    }
}
