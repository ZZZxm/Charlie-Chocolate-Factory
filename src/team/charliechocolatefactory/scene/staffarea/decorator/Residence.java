package team.charliechocolatefactory.scene.staffarea.decorator;

import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Residence
 * @description TODO
 * @date 2020/11/18 14:19
 */
public abstract class Residence extends Scene {
    public Residence(){}

    public Residence(double x){
        super(x);
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "abstract class Residence extends Scene";
    }
}
