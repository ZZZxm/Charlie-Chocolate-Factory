package team.charliechocolatefactory.product.chocolate;


import team.charliechocolatefactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;
import team.charliechocolatefactory.rawmaterial.*;

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
     * @param shelfLife how many month
     * @param content   cocoa's content
     * @implNote this class can not be directly used to create objects, so it's constructor is protected
     */
    protected Chocolate(String name, int shelfLife, int weight, double content) {
        super(name, shelfLife, weight);
        this.cocoaContent = content;
    }
}
