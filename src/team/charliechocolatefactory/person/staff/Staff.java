package team.charliechocolatefactory.person.staff;

import java.util.UUID;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.StaffArea;


/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Staff
 * @description The base class of staffs, including workers, managers, guards and a general manager.
 * @date 2020/11/7 15:17
 */
public abstract class Staff extends Person {

    public String identity="staff";

    /** staff ID number, each is unique */
    protected String id;

    /** salary of the staff */
    protected int salary;

    /** where he/she works at */
    protected StaffArea department;

    /** 0: normal 1: suspended 2: fired */
    protected int state;


    public Staff(String name, int age, Sex sex, int salary, StaffArea workingArea) {
        super(name, age, sex);
        this.salary = salary;
        this.department = workingArea;
        this.id = allocateId();
    }

    public Staff(String name, int age, Sex sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
        this.department = null;
        this.id = allocateId();
    }

    /**
     * @return id of the worker
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return salary of the worker
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Workers can receive his/her salary at the end of every month.
     */
    public void receiveSalary() {
        if (this.state == 0) {
            this.asset += this.salary;
        }
        else {
            System.out.println("Sorry, You won't get paid this month.");
        }
    }

    /**
     * @return the department that the worker works at
     */
    public StaffArea getDepartment() {
        return this.department;
    }

    /**
     * @return allocate a unique UUID for every worker
     */
    protected static String allocateId() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }

    /**
     * Staffs can move to anywhere.
     * @param dest destination
     */
    public boolean moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The staff " + this.name + "moves to " + dest.toString());
        return true;
    }

    /**
     * set the initial asset of the staff
     */
    @Override
    protected abstract void setInitialAsset();

    @Override
    public String toString() {
        return "abstract class Staff extends Person";
    }
}
