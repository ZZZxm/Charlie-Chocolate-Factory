package team.charliechocolatefactory.scene.staffarea;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname Office
 * @description As One kind of staff area, it represents office building.
 * @date 2020/11/9 20:04
 */
public class Office extends StaffArea {

    /**
     * constructor of the Office with no manager specified
     */
    public Office(String location, double cost, double area)
    {
        super(location, cost, area);
    }

    /**
     * constructor of the Office with no manager specified
     */
    public Office(String location, double cost, double area, Manager newManager)
    {
        super(location, cost, area, newManager);
    }

    /**
     * create and add a worker to the area
     * @param name name of the worker
     * @param age age of the worker
     * @param sex sex of the worker
     * @param salary salary of the worker
     */
    @Override
    public void addWorker(String name, int age, Person.Sex sex, int salary) {
        workerObj = new OfficeWorker(name, age, sex, salary);
        workerList.add(workerObj);
    }

}
