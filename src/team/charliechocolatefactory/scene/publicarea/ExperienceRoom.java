package team.charliechocolatefactory.scene.publicarea;

import team.charliechocolatefactory.person.staff.worker.UtilityWorker;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname ExperienceRoom
 * @description Designed for visitors to experience making chocolate
 * @date 2020/11/9 19:52
 */
public class ExperienceRoom extends PublicArea {

    /**
     * constructor of ExperienceRoom
     */
    public ExperienceRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return "experience room";
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }
}
