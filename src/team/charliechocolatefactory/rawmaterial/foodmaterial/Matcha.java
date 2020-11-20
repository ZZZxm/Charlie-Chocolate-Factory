package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

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

	public Matcha() {
		this(1, 1);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement Matcha.process()
		 */
		return false;
	}
}
