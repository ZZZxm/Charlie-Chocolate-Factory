package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Egg
 * @description egg the food raw material
 * @date 2020-11-07 16:24:56
 */
public class Egg extends FoodMaterial {
    /**
     * ctor of Egg
     * <p>
     * This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Egg(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }

    public Egg() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Egg.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy egg!");
        return (Egg) super.clone();
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
