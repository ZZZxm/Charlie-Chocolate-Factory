package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Nut
 * @description nut the food raw material
 * @date 2020-11-07 16:24:10
 */
public class Nut extends FoodMaterial {
    /**
     * ctor of Nut
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     */
    public Nut(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public Nut() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Nut.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy nut!");
        return (Nut) super.clone();
    }
}
