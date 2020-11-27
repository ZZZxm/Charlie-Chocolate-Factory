package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.SceneNameConst;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Villa
 * @description TODO
 * @date 2020/11/24 20:30
 */
public class Villa extends Residence {
    private int villaNumber;

    public Villa() {
        super(50000);
        System.out.println("A villa has been built");
    }

    @Override
    public String getDescription() {
        return "This is a villa";
    }

    @Override
    public String toString() {
        return SceneNameConst.VILLA;
    }

}
