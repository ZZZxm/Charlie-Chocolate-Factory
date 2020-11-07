package team.charliechocolatefactory.person.staff;

import java.util.UUID;

import javafx.scene.Scene;
import team.charliechocolatefactory.person.Person;


/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Staff
 * @description The base class of staffs, including workers, managers, guards and a general manager.
 * @date 2020/11/7 15:17
 */
public abstract class Staff extends Person {

    /** staff ID number, each is unique */
    protected String id;

    protected int salary;

    /** where he/she works at */
    protected Scene department;

    /** 0: normal 1: suspended 2: fired */
    protected int state;

    public Staff(String name, int age, Sex sex, int salary, Scene department) {
        super(name, age, sex);
        this.salary = salary;
        this.department = department;
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
    public Scene getDepartment() {
        return this.department;
    }

    @Override
    protected abstract void setInitialAsset();

    /**
     * @return allocate a unique UUID for every worker
     */
    protected static String allocateId() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }

    @Override
    public String toString() {
        return "abstract class Staff{ id = "
                + this.id;
    }
}
