package team.charliechocolatefactory.rawmaterial;

/**
 * @project chocolateFactory
 * @classname Egg
 * @description egg the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:24:56
 */
public class Egg extends FoodMaterial {
	/**
	 * ctor of Egg
	 * 
	 * This ctor sets state to LIQUID.
	 * 
	 * @param initialQuant         initial quantity
	 * @param timeBeforeExpiration initial time to expire
	 */
	public Egg(double initialQuant, double initialExpireTime) {
		super(initialQuant, initialExpireTime, State.LIQUID);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement Egg.process()
		 */
		return false;
	}
}
