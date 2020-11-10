package team.charliechocolatefactory.rawmaterial;

/**
 * @project chocolateFactory
 * @classname Matcha
 * @description matcha the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:26:35
 */
public class Matcha extends FoodMaterial {
	/**
	 * ctor of Matcha
	 * 
	 * This ctor sets state to POWDER.
	 * 
	 * @param initialQuant         initial quantity
	 * @param timeBeforeExpiration initial time to expire
	 */
	public Matcha(double initialQuant, double initialExpireTime) {
		super(initialQuant, initialExpireTime, State.POWDER);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement Matcha.process()
		 */
		return false;
	}
}
