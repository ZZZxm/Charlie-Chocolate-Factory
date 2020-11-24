package team.charliechocolatefactory.person.staff;

import java.util.Observer;
import java.util.UUID;

import team.charliechocolatefactory.person.Person;
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
//    /** response to PaySubject */
//    public void update(){
//        System.out.println("发工资的时候就是欢天喜地打工人！");
//    }

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
        } else {
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
        return uuid.replaceAll("[a-zA-Z]|-", "").substring(3, 11);
    }

    /**
     * Staffs can move to anywhere.
     *
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

    /**
     * display information of the staff
     */
    public void display() {

        System.out.printf("%-10s%-20s%-5d%-10s%s%n", id, name, age, sex, department.toString());
    }

    /**
     * respond to the payroll system, receive salary
     * for design pattern --- Observer
     */
    public void getPaid() {
        this.asset += salary;
    }

    public void getPaid(int pay) {
        this.asset += pay;
    }

    @Override
    public String toString() {
        return "abstract class Staff extends Person";
    }
}
