package test;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Manager;
import team.charliechocolatefactory.scene.staffarea.Office;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Test
 * @description TODO
 * @date 2020/11/22 13:37
 */
public class Test {

    public static void main(String[] args) {

        Office office = new Office();
        Manager officeManager = office.getManager();

        System.out.println(office.getWorkerList());
        officeManager.hireWorker("worker1", Person.Sex.MALE, 18, 1000, office);
        System.out.println(office.getWorkerList());
        officeManager.hireWorker("worker2", Person.Sex.MALE, 18, 1000, office);
        System.out.println(office.getWorkerList());
    }
}
