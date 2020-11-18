package team.charliechocolatefactory.rawmaterial.foodmaterial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.FoodMaterial;

/**
 * @project chocolateFactory
 * @classname EdibleGoldLeaf
 * @description edible gold leaf the food raw material
 * @author Ngae Zeh-ghau
 * @date 2020-11-07 16:28:07
 */
public class EdibleGoldLeaf extends FoodMaterial {
	/**
	 * ctor of EdibleGoldLeaf
	 * 
	 * This ctor sets state to SOLID.
	 * 
	 * @param initialQuant         initial quantity
	 * @param timeBeforeExpiration initial time to expire
	 */
	public EdibleGoldLeaf(double initialQuant, double initialExpireTime) {
		super(initialQuant, initialExpireTime, State.SOLID);
	}

	public EdibleGoldLeaf() {
		this(1, 1);
	}

	@Override
	public boolean process() {
		/*
		 * TODO: implement EdibleGoldLeaf.process()
		 */
		return false;
	}
}