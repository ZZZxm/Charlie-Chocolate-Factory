package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Sugar
 * @description sugar the food raw material
 * @date 2020-11-07 16:29:18
 */
public class Sugar extends FoodMaterial {
    /**
     * ctor of Sugar
     *
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     * @param state                state of sugar
     */
    public Sugar(double initialQuant, double initialExpireTime, State state) {
        super(initialQuant, initialExpireTime, state);
    }

    public Sugar(State state) {
        this(1, 1, state);
    }

    public Sugar() {
        this(State.SOLID);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Sugar.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy sugar!");
        return (Sugar) super.clone();
    }
}
