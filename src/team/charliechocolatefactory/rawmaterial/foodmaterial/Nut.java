package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @project chocolateFactory
 * @classname Nut
 * @description nut the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:24:10
 */
public class Nut extends FoodMaterial {
	/**
	 * ctor of Nut
	 * 
	 * This ctor sets state to SOLID.
	 * 
	 * @param initialQuant         initial quantity
	 * @param timeBeforeExpiration initial time to expire
	 */
	public Nut(double initialQuant, double initialExpireTime) {
		super(initialQuant, initialExpireTime, State.SOLID);
	}

	public Nut() {
		this(1, 1);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement Nut.process()
		 */
		return false;
	}
}
