package team.charliechocolatefactory.rawmaterial;

import java.util.LinkedList;

/**
 * @project chocolateFactory
 * @classname RawMaterial
 * @description ROOT CLASS RawMaterial
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:12:41
 */
public abstract class RawMaterial {

    /**
     * ctor of RawMaterial
     * 
     * @param initialQuant initial quantity
     */
    protected RawMaterial(double initialQuant) {
        quantity = initialQuant;
    }

    /**
     * ctor of RawMaterial
     */
    protected RawMaterial() {
        this(1);
    }

    /**
     * getter of quantity
     * 
     * @return quantity
     */
    public double quantity() {
        return quantity;
    }

    /**
     * acquire - Add the quantity of raw material.
     *
     * @param quant quantity to add
     * @return the exact quantity acquired
     */
    public double acquire(double quant) {
        quantity += quant;
        return quant;
    }

    /**
     * consume - Subtract the quantity of raw material.
     * 
     * @param quant quantity to subtract
     * @return the exact quantity consumed
     */
    public double consume(double quant) {
        double quantConsumed = quant;

        if (quantity - quant <= 0) {
            quantConsumed = quantity;
            quantity = 0;
            notifyOnExhaustion();
        }
        quantity -= quant;
        return quantConsumed;
    }

    /**
     * add exhaustion obsever (to exhaustionObserverList)
     * 
     * This is a part of the "observer" pattern.
     * 
     * TODO: The type of observer remains to be defined.
     * 
     * @param observer observer to add
     */
    public boolean addExhaustionObsever(Object observer) {
        return exhaustionObserverList.add(observer);
    }

    /*
     * TODO: removeExhaustionObsever may be implemented if needed.
     */

    /**
     * notify on exhaustion
     * 
     * This function is called when items are exhausted, maybe by consume().
     */
    protected void notifyOnExhaustion() {
        /*
         * TODO: notifyOnExhaustion()
         * 
         * This is a part of the "observer" pattern.
         * 
         * Hint: exhaustionObseverList is the array holding all the observers that
         * should be notified here.
         */
    }

    /**
     * quantity of the raw material
     * 
     * For FoodRawMaterial subclass, this attribute is intended to represent the
     * quantity of items that shares the same expire date.
     * 
     * This attribute may have different units with respect to particular subclass
     * type.
     */
    protected double quantity;

    /**
     * obsever array of exhaustion
     * 
     * Array holding all the observer that should be notified when
     * notifyOnExhaustion() is called.
     * 
     * This is a part of the "observer" pattern.
     * 
     * TODO: The type of observer remains to be defined.
     */
    private LinkedList<Object> exhaustionObserverList;
}
