package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.scene.SceneNameConst;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Villa
 * @description This is a villa
 * @date 2020/11/24 20:30
 */
public class Villa extends Residence {

    /**
     * Show that a villa has been built
     */
    public Villa() {
        super(50000);
        System.out.println("A villa has been built");
    }

    public Villa(String location, double cost, double area) {
        super(location, cost, area);
    }

    @Override
    public String getDescription() {
        return "This is a villa";
    }

    /**
     * Return the build cost
     */
    @Override
    public double getBuildCost() {
        return 50000;
    }

    @Override
    public String toString() {
        return SceneNameConst.VILLA;
    }

}
