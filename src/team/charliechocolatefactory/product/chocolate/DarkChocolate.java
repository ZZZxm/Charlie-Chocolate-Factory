package product.chocolate;

import javafx.scene.Scene;
import packageSource.bag.Bag;
import product.Product;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname DarkChocolate
 * @description this is dark chocolate
 * @date 2020/11/8 15:15
 */
public class DarkChocolate extends Chocolate{

// constructor
    /**
     * @param loc
     */
    public DarkChocolate( Scene loc) {
        super("Dark chocolate", loc, 18,10, 0.78);
    }
}
