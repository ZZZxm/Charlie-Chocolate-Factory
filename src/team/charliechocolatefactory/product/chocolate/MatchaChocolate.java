package product.chocolate;

import javafx.scene.Scene;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MatchaChocolate
 * @description this is matcha chocolate
 * @date 2020/11/8 15:41
 */
public class MatchaChocolate extends Chocolate {

//fields
    public double matchaContent;

// constructor
    /**
     * @param loc
     */
    public MatchaChocolate(Scene loc, double content) {
        super("Matcha chocolate", loc, 18,8, 0.4);
        this.matchaContent = matchaContent;
    }

    /**
     * @return matcha's content
     */
    public double getMatchaContent(){
        return this.matchaContent;
    }

    /**
     * how many grams' matcha is needed
     * @return
     */
    public double getMatchaWieght(){
        return this.matchaContent * this.weight;
    }
}
