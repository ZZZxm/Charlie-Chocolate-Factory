package team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop;

import team.charliechocolatefactory.machine.processmachine.productmachine.ProductMachine;
import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @author Y.C.Young Yuan.Cai
 * @project chocolateFactory
 * @classname Workshop
 * @description Workshop where the production is produced
 * @date 2020/11/9 20:05
 */
public abstract class Workshop extends ManufacturingArea {

    public ProductMachine productMachine;


    public Workshop() {
        this("Workshop", 10000, 100);
    }

    public Workshop(String location, double cost, double area) {
        super(location, cost, area, Manager.getWorkShopManager());
        Manager.getWorkShopManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getWorkShopManager());
    }


    /**
     * @return name of the scene as a String
     */
    @Override
    public abstract String toString();

    /*
    public String toString() {
        return SceneNameConst.WORKSHOP;
    }
    */

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

    /**
     * produce product 1 of the production family: Chocolate
     *
     */
    public abstract void produceChocolate();

    /**
     * produce product 2 of the production family: ChocolateCookie
     *
     */
    public abstract void produceChocolateCookie();


}
