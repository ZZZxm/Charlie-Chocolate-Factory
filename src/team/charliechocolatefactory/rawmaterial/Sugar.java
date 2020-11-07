package team.charliechocolatefactory.rawmaterial;

/**
 * @project chocolateFactory
 * @classname Sugar
 * @description sugar the food raw material
 * @author Ngae Zeh-ghau
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

	@Override
	public boolean process() {
		/*
		 * TODO: implement Sugar.process()
		 */
		return false;
	}
}
