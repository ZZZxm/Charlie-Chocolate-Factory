package product.chocolate;

import javafx.scene.Scene;
import rawSource.Nut;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname SandwichChocolate
 * @description this is SandwichChocolate with nut
 * @date 2020/11/8 15:23
 */
public class SandwichChocolate extends Chocolate {

    //fields
    public Nut nut;

// constructor

    /**
     * @param loc
     */
    public SandwichChocolate(Scene loc, Nut nut) {
        super("Sandwich chocolate", loc, 6, 10 + nut.weight, 0.5);
        this.nut = nut;
    }

    /**
     * @return nut
     */
    public Nut getNut() {
        return this.nut;
    }
}