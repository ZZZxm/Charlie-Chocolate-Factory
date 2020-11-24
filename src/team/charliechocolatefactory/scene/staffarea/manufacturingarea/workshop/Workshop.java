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
        super();
    }

    public Workshop(String location, double cost, double area) {
        super(location, cost, area, Manager.workShopManager);
        Manager.workShopManager.addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.workShopManager);
    }


     /**
    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return "workshop";
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

    /**
     * produce product 1 of the production family: Chocolate
     *
     * @return a int
     */
    public abstract int produceChocolate();

    /**
     * produce product 2 of the production family: ChocolateCookie
     *
     * @return a int
     */
    public abstract int produceChocolateCookie();


}
