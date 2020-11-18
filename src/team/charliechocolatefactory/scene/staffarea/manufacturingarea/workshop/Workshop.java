package team.charliechocolatefactory.scene.staffarea.manufacturingarea.workshop;


import team.charliechocolatefactory.machine.processmachine.productmachine.ProductMachine;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname Workshop
 * @description This is the basic class of all the workshops, a workshop produces a family of products.
 * @date 2020/11/13 15:42
 */
public abstract class Workshop extends ManufacturingArea {
    public ProductMachine productMachine;

    public Workshop() {
        super("Default location", 1000, 1000, null);
    }

    public Workshop(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }

    /**
     * create and add a worker to the area
     *
     * @param name   name of the worker
     * @param age    age of the worker
     * @param sex    sex of the worker
     * @param salary salary of the worker
     */
    @Override
    public void addWorker(String name, int age, Person.Sex sex, int salary) {
        WorkshopWorker workerObj = new WorkshopWorker(name, age, sex, salary, this);
        workerList.add(workerObj);
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

    public String toString() {
        return "class Workshop";
    }
}
