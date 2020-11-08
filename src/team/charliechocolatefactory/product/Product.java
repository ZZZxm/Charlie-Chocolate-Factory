package product;
import javafx.scene.Scene;
import packageSource.Package;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname Product
 * @description the basic class of all products
 * @date 2020/11/8 09:22
 */
public abstract class Product {

// fields

    protected String productName;

    protected int amount;

    protected String producedDate; // yyyy-mm-dd

    protected int shelfLife; // how many month

    public Scene location;

    protected int weight; // weight of single item, in gram

    /**
     *  0 -> still producing
     *  1 -> produced but un-packaged
     *  2 -> packaging
     *  3 -> packaged
     *  4 -> storied
     *  5 -> loading
     *  6 -> delivering
     *  ...
     */
    public int state;

    protected Package pack;

// constructor

    /**
     * @param name
     * @param loc
     * @param shelfLife how many month
     */
    public Product(String name, Scene loc, int shelfLife, int weight){
        this.productName = name;
        this.location = loc;
        this.shelfLife = shelfLife;
        this.amount = 0;
        this.producedDate= null;
        this.state = 0;
        this.weight = weight;
    }

// methods

    /**
     * @param name the certain product's name
     */
    protected void setName(String name){
        this.productName = name;
        return;
    }

    /**
     * set the name of the product
     *
     * @return product's name
     */
    protected String getName(){
        return this.productName;
    }

    /**
     * @param amount the amount of the product
     */
    protected void setAmount(int amount){
        this.amount = amount;
        return;
    }

    /**
     * @return the amount of the product
     */
    protected int getAmount(){
        return this.amount;
    }

    /**
     * set the state of the product
     *
     * @param state
     */
    protected void setState(int state){
        this.state = state;
        return;
    }

    /**
     * @return the state of the product
     */
    protected int getState(){
        return state;
    }

    /**
     * the product is delivered from location to dest
     * @param dest the destination
     */
    protected void deliveredTo(Scene dest){
        this.location = dest;
        return;
    }

    /**
     * @return the location of the product
     */
    protected Scene getLocation(){
        return this.location;
    }

    /**
     * @param date template yyyy-mm-dd
     */
    protected void setProducedDate(String date){
        this.producedDate = date;
        return;
    }

    /**
     * @return the producedDate of the product
     */
    protected String getProducedDate(){
        return this.producedDate;
    }

    /**
     * set the shelf life of th product
     * @param shelfLife how many month
     */
    protected void setShelfLife(int shelfLife){
        this.shelfLife = shelfLife;
        return;
    }

    /**
     * @return the shelf life of the product
     */
    protected int getShelfLife(){
        return this.shelfLife;
    }

    // package the product by modifying the field -> pack
    protected abstract void packaging();

    /**
     * set the weight of this product's single item
     * @param weight
     */
    protected void setWeight(int weight){
        this.weight = weight;
        return;
    }

    /**
     * @return the weight of this product's single item, in gram
     */
    protected int getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return "abstract class : Product";
    }
}
