package team.charliechocolatefactory.product;

import team.charliechocolatefactory.rawmaterial.PackageMaterial;
import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.scene.Scene;

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
    protected int state;

    protected PackageMaterial pack;

    public ArrayList<RawMaterial> ingredientList;

// constructor

    /**
     * @param name
     * @param shelfLife how many month
     */
    public Product(String name, int shelfLife, int weight){
        this.productName = name;
        this.shelfLife = shelfLife;
        this.producedDate= null;
        this.state = 0;
        this.weight = weight;
        this.ingredientList = new ArrayList<RawMaterial>();
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
    public String getName(){
        return this.productName;
    }

    /**
     * @return the state of the product
     */
    public int getState(){
        return state;
    }

    /**
     * this product is in the next state.
     */
    protected void gotoNextState(){ this.state++; }

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
    public String getProducedDate(){
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
    public int getShelfLife(){
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
    public int getWeight(){
        return this.weight;
    }

    /**
     * produce the product
     */
    public void producing(){
        System.out.println("Start producing "+this.productName+"...");
        this.state=0;
        System.out.println("Finish producing "+this.productName+".");
        this.state=1;
        return;
    }

    /**
     * package the product by modifying the field -> pack
     */
    public abstract void packaging();

    /**
     * initialize the ingredient list of the product
     */
    protected abstract void initIngredientList();

}
