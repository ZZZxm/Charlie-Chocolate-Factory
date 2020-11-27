package team.charliechocolatefactory.scene.decorator;

import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.SceneNameConst;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Flat
 * @description TODO
 * @date 2020/11/24 20:35
 */
public class Flat extends Residence {

    public Flat() {

        super(30000);

        System.out.println("A flat has been built");
    }


    @Override
    public String getDescription() {
        return "This is a flat";
    }


    @Override
    public String toString() {
        return SceneNameConst.FLAT;
    }

}

