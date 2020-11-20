package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.RawMaterial;

import java.util.LinkedList;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname FoodMaterial
 * @description food raw material, which can expire
 * @date 2020-11-07 16:12:47
 */
public abstract class FoodMaterial extends RawMaterial implements Cloneable {

    enum State {
        POWDER, SOLID, LIQUID
    }

    /**
     * ctor of FoodMaterial
     *
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     * @param state                state of material
     */
    protected FoodMaterial(double initialQuant, double initialExpireTime, State state) {
        super(initialQuant);
        timeBeforeExpiration = initialExpireTime;
        this.state = state;
    }

    protected FoodMaterial(State state) {
        this(1, 1, state);
    }

    /**
     * getter of timeToExpire
     *
     * @return timeToExpire
     */
    public double timeToExpire() {
        return timeBeforeExpiration;
    }

    /**
     * elapse
     * <p>
     * This function is related to timeToExpire. If timeToExpire < 0 then the items
     * are expired.
     * <p>
     * This funtion is intended to be called whenever time advances.
     * <p>
     * This is a part of the "observer" pattern.
     *
     * @param deltaTime time elapsed
     * @return true if the items are expired
     */
    public boolean elapse(double deltaTime) {
        timeBeforeExpiration -= deltaTime;
        if (timeBeforeExpiration < 0) {
            timeBeforeExpiration = 0;
            notifyOnExpiration();
            return true;
        } else {
            return false;
        }
    }

    /**
     * add expiration obsever (to exhaustionObserverList)
     * <p>
     * This is a part of the "observer" pattern.
     * <p>
     * TODO: The type of observer remains to be defined.
     *
     * @param observer observer to add
     */
    public boolean addExpirationObsever(Object observer) {
        return expirationObseverList.add(observer);
    }

    /*
     * TODO: removeExpirationObsever may be implemented if needed.
     */

    /**
     * use the material
     * <p>
     * This is a part of the "strategy" pattern.
     *
     * @param quant quantity to use
     * @return true if the material can be used.
     */
    public boolean use(double quant) {
        if (quantity < quant) {
            return false;
        }
        /*
         * XXX: more implments in use()
         */
        return process();
    }

    /**
     * process steps of material
     * <p>
     * The function is called by use().
     * <p>
     * This is a part of the "strategy" pattern.
     *
     * @param toState change to state
     * @return true if it can be processed
     */
    public abstract boolean process();

    /**
     * notify on expiration
     * <p>
     * This function is called when items are exhausted, maybe by consume().
     */
    protected void notifyOnExpiration() {
        /*
         * TODO: notifyOnExpiration()
         *
         * This is a part of the "observer" pattern.
         *
         * Hint: expirationObseverList is the list holding all the observers that should
         * be notified here.
         */
    }

    /**
     * melt - Change the state from SOLID into LIQUID.
     *
     * @return false if melt can be done.
     */
    protected boolean melt() {
        if (state != State.SOLID) {
            return false;
        }
        /*
         * XXX: more implements in melt()
         */
        state = State.LIQUID;
        return true;
    }

    /**
     * melt - Change the state from SOLID into POWDER.
     *
     * @return false if grind can be done.
     */
    protected boolean grind() {
        if (state != State.SOLID) {
            return false;
        }
        /*
         * XXX: more implements in grind()
         */
        state = State.POWDER;
        return true;
    }

    /**
     * time before expiration
     */
    private double timeBeforeExpiration;

    /**
     * state of material
     */
    protected State state;

    /**
     * obsever array of expiration
     * <p>
     * Array holding all the observer that should be notified when
     * notifyOnExpiration() is called.
     * <p>
     * This is a part of the "observer" pattern.
     * <p>
     * TODO: The type of observer remains to be defined.
     */
    private LinkedList<Object> expirationObseverList;
}
