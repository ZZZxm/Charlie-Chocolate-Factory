package team.charliechocolatefactory.rawmaterial.foodmaterial;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Alcohol
 * @description alcohol the food raw material
 * @date 2020-11-07 16:22:43
 */
public class Alcohol extends FoodMaterial {
    /**
     * ctor of Alcohol
     * <p>
     * This ctor sets state to LIQUID.
     *
     * @param initialQuant initial quantity
     */
    public Alcohol(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }

    public Alcohol() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Alcohol.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    	System.out.println("Successfully copy alcohol!");
        return (Alcohol) super.clone();
    }
}
