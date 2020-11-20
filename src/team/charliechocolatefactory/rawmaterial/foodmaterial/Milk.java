package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Milk
 * @description milk the food raw material
 * @date 2020-11-07 16:19:58
 */
public class Milk extends FoodMaterial {
    /**
     * ctor of Milk
     * <p>
     * This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     */
    public Milk(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }

    public Milk() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Milk.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy milk!");
        return (Milk) super.clone();
    }
}
