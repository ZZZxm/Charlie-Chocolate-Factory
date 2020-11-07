package team.charliechocolatefactory.rawmaterial;

/**
 * @project chocolateFactory
 * @classname Butter
 * @description butter the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:23:18
 */
public class Butter extends FoodMaterial {
	/**
	 * ctor of Butter
	 * 
	 * This ctor sets state to SOLID.
	 * 
	 * @param initialQuant         initial quantity
	 * @param timeBeforeExpiration initial time to expire
	 */
	public Butter(double initialQuant, double initialExpireTime) {
		super(initialQuant, initialExpireTime, State.SOLID);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement Butter.process()
		 */
		return false;
	}
}
