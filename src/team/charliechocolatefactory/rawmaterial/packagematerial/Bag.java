package team.charliechocolatefactory.rawmaterial.packagematerial;

/**
 * @project chocolateFactory
 * @classname Bag
 * @description bag the package material
 * @author Ngae Zeh-ghau
 * @date 2020-11-09 22:04:09
 */
public class Bag extends PackageMaterial {
	/**
	 * ctor of Bag
	 * 
	 * @param initialQuant initial quantity
	 */
	public Bag(double initialQuant) {
		super(initialQuant);
	}

	public Bag() {
		this(1);
	}

}
