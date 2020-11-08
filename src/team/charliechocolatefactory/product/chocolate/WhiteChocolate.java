package product.chocolate;

import javafx.scene.Scene;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname WhiteChocolate
 * @description this is white chocolate.
 * @date 2020/11/8 15:15
 */
public class WhiteChocolate extends Chocolate{

// constructor
    /**
     * @param loc
     */
    public WhiteChocolate(Scene loc) {
        super("White chocolate", loc, 12,5, 0.1);
    }
}
