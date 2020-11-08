package product.chocolateProduct;

import javafx.scene.Scene;
import packageSource.bag.Bag;
import product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateWafer
 * @description this is chocolate wafer
 * @date 2020/11/8 15:27
 */
public class ChocolateWafer extends Product {

// constructor
    /**
     * @param loc
     */
    public ChocolateWafer(Scene loc) {
        super("Chocolate Wafer", loc, 18, 100);
    }

// methods
    @Override
    protected void packaging() {
        System.out.println("Start packaging Chocolate Ice-cream...");
        super.pack = new Bag();
        super.state = 2;
        System.out.println("Finish packaging.");
        super.state = 3;

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
        return;
    }
}
