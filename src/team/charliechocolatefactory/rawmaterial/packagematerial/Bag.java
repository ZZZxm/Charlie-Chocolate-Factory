package team.charliechocolatefactory.rawmaterial.packagematerial;

import team.charliechocolatefactory.rawmaterial.foodmaterial.Alcohol;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname Bag
 * @description bag the package material
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy a bag!");
        return (Bag) super.clone();
    }
}
