package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Water
 * @description Water the food raw material
 * @date 2020-11-07 16:18:34
 */
public class Water extends FoodMaterial {
    /**
     * ctor of Water
     * <p>
     * This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     */
    public Water(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }

    public Water() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Water.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy water!");
        return (Water) super.clone();
    }
}
