package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @project chocolateFactory
 * @classname Alchohol
 * @description alchohol the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:22:43
 */
public class Alchohol extends FoodMaterial {
	/**
	 * ctor of Alchohol
	 * 
	 * This ctor sets state to LIQUID.
	 * 
	 * @param initialQuant         initial quantity
	 */
	public Alchohol(double initialQuant, double initialExpireTime) {
		super(initialQuant, initialExpireTime, State.LIQUID);
	}

	public Alchohol() {
		this(1, 1);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement Alchohol.process()
		 */
		return false;
	}
}
