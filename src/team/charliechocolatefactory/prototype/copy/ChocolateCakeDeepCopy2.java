package team.charliechocolatefactory.prototype.copy;

import team.charliechocolatefactory.factory.product.MilkChocolate;
import team.charliechocolatefactory.prototype.material.Agg;

import java.io.*;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolateCake
 * @description
 * We need cloned classes, chocolate cake classes,
 * This class mainly tests Deep copies2
 * @date 2020/11/15 17:14
 */

/**
 * must implements Cloneable.
 * The first second of deep copy directly rewrites our clone method
 */
public class ChocolateCakeDeepCopy2 implements Cloneable, Serializable {

    /**
     * ChocolateCake name;
     */
    private String name;

    /**
     * Chocolate cake contains eggs
     */
    private Agg agg;

    /**
     * Chocolate cake contains chocolate,this user factor pattern MilkChocolate;
     */
    private MilkChocolate chocolate;

    /**
     * All parameter constructed functions
     * @param name:ChocolateCake name;
     * @param agg:ChocolateCake agg;
     * @param chocolate:ChocolateCake:chocolate
     */
    public ChocolateCakeDeepCopy2(String name, Agg agg, MilkChocolate chocolate) {
        this.name = name;
        this.agg = agg;
        this.chocolate = chocolate;
    }


    /**
     * @return this class name;
     */
    public String getName() {
        return name;
    }

    /**
     * @param name:set this class name;
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return: this class agg;
     */
    public Agg getAgg() {
        return agg;
    }

    /**
     * @param agg:set this class agg;
     */
    public void setAgg(Agg agg) {
        this.agg = agg;
    }

    /**
     * @return: get this chololege;
     */
    public MilkChocolate getChocolate() {
        return chocolate;
    }

    /**
     * @return: set this chololege;
     */
    public void setChocolate(MilkChocolate chocolate) {
        this.chocolate = chocolate;
    }

    /**
     * We manually implemented the clone method to implement a deep copy of our classes.
     * @return:Duix after cloning
     * @throws CloneNotSupportedException:Class whose type cannot be converted
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Define our input and output streams:
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        // the core idea, we read in first, then write it out, and then make a copy effect;
        try {

            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // Write out the object of this class;
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            ChocolateCakeDeepCopy2 chocolateCakeDeepCopy2 = (ChocolateCakeDeepCopy2) ois.readObject();
            return chocolateCakeDeepCopy2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                // Close the flow;
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
