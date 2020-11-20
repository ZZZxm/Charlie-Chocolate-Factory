package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Matcha
 * @description matcha the food raw material
 * @date 2020-11-07 16:26:35
 */
public class Matcha extends FoodMaterial {
    /**
     * ctor of Matcha
     * <p>
     * This ctor sets state to POWDER.
     *
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     */
    public Matcha(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.POWDER);
    }

    public Matcha() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Matcha.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy matcha!");
        return (Matcha) super.clone();
    }
}
