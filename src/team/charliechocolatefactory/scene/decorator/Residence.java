package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.scene.Scene;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Residence
 * @description this is residence
 * @date 2020/11/18 14:19
 */
public abstract class Residence extends Scene implements DecoratorComponent{
    public Residence() { }

    /**
     * show the cost of the residence
     */
    public Residence(double x) {
        super(x);
    }

    /**
     * String representing the description of the residence
     */
    public abstract String getDescription();

    @Override
    public String toString() {
        return "abstract class Residence extends Scene";
    }
}
