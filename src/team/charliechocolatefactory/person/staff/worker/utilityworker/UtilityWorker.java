package team.charliechocolatefactory.person.staff.worker.utilityworker;

import team.charliechocolatefactory.scene.GarbageStation;
import team.charliechocolatefactory.scene.decorator.Residence;
import team.charliechocolatefactory.scene.publicarea.PublicArea;
import team.charliechocolatefactory.scene.staffarea.DiningRoom;
import team.charliechocolatefactory.scene.staffarea.Office;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.ManufacturingArea;

public interface UtilityWorker {

    /**
     * Visitor Pattern: worker maintenance scenes
     *
     * @param s concrete scene
     */
    void visit(PublicArea s);

    void visit(GarbageStation s);

    void visit(ManufacturingArea s);

    void visit(DiningRoom s);

    void visit(Office s);

    void visit(Residence s);
}
