package team.charliechocolatefactory.rawmaterial.packagematerial;

import team.charliechocolatefactory.rawmaterial.RawMaterial;

/**
 * @project chocolateFactory
 * @classname PackageMaterial
 * @description package material
 * This class have no extra methods or attrs now!
 * @author Ngae Zeh-ghau
 * @date 2020-11-09 20:48:19
 */
public class PackageMaterial extends RawMaterial implements Cloneable {

	/**
	 * ctor of PackageMaterial
	 * 
	 * @param initialQuant initial quantity
	 */
	protected PackageMaterial(double initialQuant) {
		super(initialQuant);
	}

	protected PackageMaterial() {
		this(1);
	}
}
