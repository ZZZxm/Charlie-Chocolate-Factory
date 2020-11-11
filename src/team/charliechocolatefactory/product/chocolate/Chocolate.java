package team.charliechocolatefactory.product.chocolate;


import team.charliechocolatefactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import team.charliechocolatefactory.rawmaterial.*;
import team.charliechocolatefactory.scene.Scene;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname Chocolate
 * @description the basic class of chocolate
 * @date 2020/11/8 15:55
 */
public abstract class Chocolate extends Product {

//fields
    /**
     * the content of Cocoa
     * dark chocolate -> 0.78
     * sandwich chocolate -> 0.5
     * matcha chocolate -> 0.4
     * milk chocolate -> 0.3
     * white chocolate -> 0.1
     */
    public double cocoaContent;


//constructor
    /**
     * @param name
     * @param loc
     * @param shelfLife how many month
     * @param content cocoa's content
     * @implNote  this class can not be directly used to create objects, so it's constructor is protected
     */
    protected Chocolate(String name, Scene loc, int shelfLife, int weight, double content) {
        super(name, loc, shelfLife, weight);
        this.cocoaContent = content;
    }

// methods
    @Override
    /**
     * Chocolates are packaged by bag.
     */
    public void packaging() {
        super.gotoNextState();
        System.out.println("Start packaging" + this.productName + "...");
        super.pack = new Bag(0);
        super.gotoNextState();
        System.out.println("Finish packaging.");
        super.gotoNextState();
        // set the producedDate of the chocolate
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
        return;
    }
}
