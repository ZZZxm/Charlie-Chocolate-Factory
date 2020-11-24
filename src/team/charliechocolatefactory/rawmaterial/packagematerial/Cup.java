package team.charliechocolatefactory.rawmaterial.packagematerial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.Alcohol;

/**
 * @project chocolateFactory
 * @classname Cup
 * @description cup the package material
 * @author Ngae Zeh-ghau
 * @date 2020-11-09 22:05:10
 */
public class Cup extends PackageMaterial {
	/**
	 * ctor of Cup
	 * 
	 * @param initialQuant initial quantity
	 */
	public Cup(double initialQuant) {
		super(initialQuant);
	}

	public Cup() {
		this(1);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Successfully copy a cup!");
		return (Cup) super.clone();
	}
}
