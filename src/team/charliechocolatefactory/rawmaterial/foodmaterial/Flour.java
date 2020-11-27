package team.charliechocolatefactory.rawmaterial.foodmaterial;


/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Flour
 * @description flour the food raw material
 * @date 2020-11-07 16:12:57
 */
public class Flour extends FoodMaterial {

    /**
     * ctor of Flour
     * <p>
     * This ctor sets state to POWDER.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Flour(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.POWDER);
    }

    public Flour() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Flour.process()
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy flour!");
        return (Flour) super.clone();
    }
}
