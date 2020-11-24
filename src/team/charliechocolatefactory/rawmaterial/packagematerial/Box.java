/**
 * @project chocolateFactory
 * @classname Box
 * @description box the package material
 * @author Ngae Zeh-ghau
 * @date 2020-11-09 22:04:02
 */
package team.charliechocolatefactory.rawmaterial.packagematerial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.Alcohol;

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

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Successfully copy a box!");
		return (Box) super.clone();
	}
}
