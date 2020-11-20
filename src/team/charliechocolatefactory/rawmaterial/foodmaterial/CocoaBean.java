package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @project chocolateFactory
 * @classname CocoaBean
 * @description cocoa bean the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:13:02
 */
public class CocoaBean extends FoodMaterial {

    /**
     * ctor of CocoaBean
     * 
     * This ctor sets state to SOLID.
     * 
     * @param initialQuant         initial quantity
     * @param timeBeforeExpiration initial time to expire
     */
    public CocoaBean(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public CocoaBean() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement CocoaBean.process()
         */
        return false;
    }
}
