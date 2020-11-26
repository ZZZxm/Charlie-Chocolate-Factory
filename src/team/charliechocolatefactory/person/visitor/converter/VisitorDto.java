package team.charliechocolatefactory.person.visitor.converter;


import team.charliechocolatefactory.person.Person;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname VisitorDto
 * @description VisitorDto Class,which can be converted to Visitor
 * @date 2020/11/26 14:47
 */
public class VisitorDto {

    protected String name;

    protected int age;

    public enum Sex {
        MALE, FEMALE,
    };

    protected Person.Sex sex;


    public VisitorDto(String name, int age, Person.Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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
    public void setSex(Person.Sex sex) {
        this.sex = sex;
    }

    /**
     * @return sex of the person
     */
    public Person.Sex getSex() {
        return this.sex;
    }

}
