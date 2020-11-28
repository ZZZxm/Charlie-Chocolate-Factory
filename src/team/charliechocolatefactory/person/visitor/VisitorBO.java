package team.charliechocolatefactory.person.visitor;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname VisitorBO
 * @description TODO
 * @date 2020/11/27 20:12
 */

import team.charliechocolatefactory.person.Person;

import java.util.ArrayList;
import java.util.List;

public class VisitorBO {

    /**
     * list as a database to store the visitors.
     */
    private static List<Visitor> visitors;

    private static VisitorBO visitorList = null;

    protected VisitorBO() {
        visitors = new ArrayList<Visitor>();
        Visitor visitor1 = new Visitor("HappyYQing", 20, Person.Sex.FEMALE);
        Visitor visitor2 = new Visitor("Kerr", 20, Person.Sex.FEMALE);
        Visitor visitor3 = new Visitor("Brian", 20, Person.Sex.MALE);
        visitors.add(visitor1);
        visitors.add(visitor2);
        visitors.add(visitor3);
    }

    public static VisitorBO getInstance() {
        if (visitorList != null) {
            return visitorList;
        } else {
            visitorList = new VisitorBO();
        }
        return visitorList;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void deleteVisitor(int code) {
        visitors.remove(code);
        System.out.println("Visitor: visitCode No "
                + code + ", deleted from database");
    }

    /**
     * search visitor from the database
     */
    public List<Visitor> getAllVisitors() {
        return visitors;
    }

    public Visitor getVisitor(int visitCode) {
        return visitors.get(visitCode);
    }

    public void updateVisitor(Visitor visitor) {
        visitors.get(visitor.getVisitCode()).setName(visitor.getName());
        System.out.println("Visitor: visitCode No "
                + visitor.getVisitCode() + ", updated in the database");
    }
}
