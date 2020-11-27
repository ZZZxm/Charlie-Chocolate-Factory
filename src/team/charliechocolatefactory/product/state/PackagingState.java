package team.charliechocolatefactory.product.state;

import team.charliechocolatefactory.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname PackagingState
 * @description TODO
 * @date 2020/11/21 22:01
 */
public class PackagingState extends ProductState {
// methods
    @Override
    public void gotoNextState(Product product) {
        product.setState(new PackagedState());
        System.out.println("From packaging state to packaged state. Waiting for storing...");
    }

    @Override
    public String toString() {
        return "packaging state";
    }
}
