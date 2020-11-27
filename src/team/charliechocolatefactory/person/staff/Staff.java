package team.charliechocolatefactory.person.staff;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

import java.util.UUID;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Staff
 * @description The base class of staffs, including workers, managers, guards and a general manager.
 * @date 2020/11/7 15:17
 */
public abstract class Staff extends Person {

    public String identity = "staff";

    /**
     * staff ID number, each is unique
     */
    protected String id;

    /**
     * salary of the staff
     */
    protected int salary;

    /**
     * where he/she works at
     */
    protected StaffArea department;

    /**
     * 0: normal 1: suspended 2: fired
     */
    protected int state;


    /**
     * You can create a staff with the working area.
     */
    public Staff(String name, int age, Sex sex, int salary, StaffArea workingArea) {
        super(name, age, sex);
        this.salary = salary;
        this.department = workingArea;
        this.id = allocateId();
    }

    /**
     * You can create a staff without the working area.
     */
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
     * @return the department that the worker works at
     */
    public StaffArea getDepartment() {
        return this.department;
    }

    /**
     * display information of the staff
     */
    public void display() {
        System.out.printf("%-10s%-20s%-5d%-10s%s%n", id, name, age, sex, department.toString());
    }

    /**
     * Staffs can move to anywhere.
     * @param dest destination
     */
    public void moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The staff " + this.name + "moves to " + dest.toString());
    }

    // ------------------------------For Design Pattern [Observer]-----------------------------------

    /**
     * respond to the payroll system, receive salary
     */
    public void getPaid() {
        this.asset += salary;
        System.out.println(this.name + " gets paid of " + this.salary + " yuan for wage.");
    }

    /**
     * specially for bonus payment
     * @param pay the paid money
     */
    public void getPaid(int pay) {
        this.asset += pay;
        System.out.println(this.name + " gets paid of " + pay + " yuan for bonus.");
    }

    // ---------------------------------------  End  ------------------------------------------------

    /**
     * @return allocate a unique UUID for every worker
     */
    protected static String allocateId() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("[a-zA-Z]|-", "").substring(3, 11);
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
