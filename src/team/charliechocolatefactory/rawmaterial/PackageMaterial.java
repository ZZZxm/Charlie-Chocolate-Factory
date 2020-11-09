package team.charliechocolatefactory.rawmaterial;

/**
 * @project chocolateFactory
 * @classname PackageMaterial
 * @description package material
 * This class have no extra methods or attrs now!
 * @author Ngae Zeh-ghau
 * @date 2020-11-09 20:48:19
 */
public abstract class PackageMaterial extends RawMaterial{
	
	/**
	 * ctor of PackageMaterial
	 * 
	 * @param initialQuant initial quantity
	 */
	protected PackageMaterial(double initialQuant) {
		super(initialQuant);
	}
}
