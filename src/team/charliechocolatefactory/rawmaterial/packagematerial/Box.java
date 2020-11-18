/**
 * @project chocolateFactory
 * @classname Box
 * @description box the package material
 * @author Ngae Zeh-ghau
 * @date 2020-11-09 22:04:02
 */
package team.charliechocolatefactory.rawmaterial.packagematerial;

public class Box extends PackageMaterial {
	/**
	 * ctor of Box
	 * 
	 * @param initialQuant initial quantity
	 */
	public Box(double initialQuant) {
		super(initialQuant);
	}

	public Box() {
		this(1);
	}
}
