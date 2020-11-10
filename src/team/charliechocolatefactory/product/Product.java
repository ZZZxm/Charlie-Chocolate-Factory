package team.charliechocolatefactory.product;
import javafx.scene.Scene;
import team.charliechocolatefactory.rawmaterial.PackageMaterial;

import java.util.ArrayList;

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

    protected PackageMaterial pack;

    public ArrayList<String> ingredientList;

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
        this.producedDate= null;
        this.state = 0;
        this.weight = weight;
        this.ingredientList = new ArrayList<String>();
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
        if(this.producedDate==null){
            this.producedDate = date;
            return;
        }
        else{
            System.out.println("Warning! The producedDate mustn't be modified after the product being produced!");
        }
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

    /**
     * package the product by modifying the field -> pack
     */
    protected abstract void packaging();

    /**
     * initialize the ingredient list of the product
     */
    protected abstract void initIngredientList();

    @Override
    public String toString(){
        return "abstract class : Product";
    }
}
