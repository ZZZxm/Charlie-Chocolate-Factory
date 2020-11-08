package product.chocolateProduct;

import javafx.scene.Scene;
import packageSource.box.Box;
import product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateCake
 * @description this is chocolate cake, the feature of which is the size.
 *                  Here I've defined size to stand for the radius of the cake.
 * @date 2020/11/8 15:25
 */
public class ChocolateCake extends Product {

// fields
    public int size; //how many inches is its radius

//constructor
    /**
     * @param loc
     */
    public ChocolateCake( Scene loc, int size) {
        super("Chocolate Cake", loc, 1, size*size*100);
        this.size = size;
    }

// methods
    @Override
    protected void packaging() {
        System.out.println("Start packaging Chocolate Cake...");
        super.pack = new Box();
        super.state = 2;
        System.out.println("Finish packaging.");
        super.state = 3;

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
        return;
    }

    /**
     * @return cake's size
     */
    public int getSize(){
        return this.size;
    }
}
