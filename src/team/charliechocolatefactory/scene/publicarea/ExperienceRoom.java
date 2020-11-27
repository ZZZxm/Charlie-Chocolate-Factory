package team.charliechocolatefactory.scene.publicarea;

import team.charliechocolatefactory.scene.SceneNameConst;
import team.charliechocolatefactory.supplement.handmadetool.HandmadeTool;
import team.charliechocolatefactory.supplement.handmadetool.HandmadeToolFactory;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname ExperienceRoom
 * @description Designed for visitors to experience making chocolate.
 * @date 2020/11/24 11:25
 */
public class ExperienceRoom extends PublicArea {

    private HandmadeTool tool = HandmadeToolFactory.getHandMadeTool();

    /**
     * number of this exp-room
     *
     * @modified by Ray
     **/
    private int expRoomNumber;

    /**
     * constructor of ExperienceRoom
     */
    public ExperienceRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
    }

    public ExperienceRoom() {
        super();
    }

    /**
     * @return the tool
     */
    public HandmadeTool getTool() {
        return tool;
    }

    /**
     * Get description of tool in this room.
     *
     * @return description
     */
    public String getToolDescription() {
        return tool.getDescription();
    }

    /**
     * Set description of tool in this room. This is a part of COW pattern.
     *
     * @return description
     */
    public void setToolDescription(String description) {
        if (tool.getRefCount() > 1 || tool == HandmadeToolFactory.getDefaultHandmadeTool()) {
            tool.deref();
            tool = new HandmadeTool(tool);
        }
        tool.setDescription(description);
    }

    public int getExpRoomNumber() {
        return expRoomNumber;
    }

    public void setExpRoomNumber(int number) {
        expRoomNumber = number;
    }

    @Override
    public String toString() {
        return SceneNameConst.EXPERIENCE_ROOM;
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
