package team.charliechocolatefactory.rawmaterial;

/**
 * @project chocolateFactory
 * @classname Water
 * @description Water the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:18:34
 */
public class Water extends FoodMaterial {
	/**
	 * ctor of Water
	 * 
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
}
