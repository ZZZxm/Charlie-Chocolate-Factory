package team.charliechocolatefactory.person;


import team.charliechocolatefactory.scene.Scene;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Person
 * @description The base class of all people
 * @date 2020/11/7 12:48
 */
public abstract class Person {

    public String identity = "person";

    protected String name;

    protected int age;

    public enum Sex {
        MALE, FEMALE,
    };

    protected Sex sex;

    /**
     * the asset of the person
     * For workers, it may be related to his/her salary.
     * For visitors, it may determine if he/she can afford the fee.
     * For stockholders, it may be related to the factory's profit.
     */
    protected double asset;

    /**
     * show where the peron is
     */
    public Scene location;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        setInitialAsset();
    }

    /**
     * @param name the person's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * set the age of the person
     *
     * @param age the modified age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return age of the person
     */
    public int getAge() {
        return this.age;
    }

    /**
     * set the sex of the person
     *
     * @param sex the modified sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * @return sex of the person
     */
    public Sex getSex() {
        return this.sex;
    }

    /**
     * A person can move from one scene to another.
     * However, not everyone has access to every scene.
     */
    public abstract boolean moveTo(Scene dest);

    /**
     * set the initial asset of the person, which depends on what kind of person he/she is
     */
    protected abstract void setInitialAsset();

    @Override
    public String toString() {
        return "abstract class Person";
    }
}
