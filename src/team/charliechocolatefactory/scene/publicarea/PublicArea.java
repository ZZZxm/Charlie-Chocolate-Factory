package team.charliechocolatefactory.scene.publicarea;

import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.person.visitor.Visitor;
import team.charliechocolatefactory.scene.Scene;

import java.util.LinkedList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname PublicScene
 * @description Inherited from basic class scene, it represents scene open for everyone.
 * @date 2020/11/9 19:43
 */
public abstract class PublicArea extends Scene {

    protected int maxVisitorNumber;
    protected LinkedList<Visitor> visitorList;

    PublicArea(String location, double cost, double area, int maxNumber)
    {
        super(location, cost, area);
        this.maxVisitorNumber = maxNumber;
        this.visitorList = new LinkedList<Visitor>();
    }

    void addVisitor(Visitor visitorObj)
    {
        if (visitorList.size() >= maxVisitorNumber)
        {
            System.out.println("The area is already full");
        }
        else if (visitorList.contains(visitorObj))
        {
            System.out.println("The area is already in the area");
        }
        else
        {
            visitorList.add(visitorObj);
        }
    }

    void removeVisitor(Visitor visitorObj)
    {
        if (visitorList.contains(visitorObj))
        {
            visitorList.remove(visitorObj);
        }
        else
        {
            System.out.println("The area is not in the area");
        }
    }

    boolean checkVisitor(Visitor visitorObj)
    {
        return visitorList.contains(visitorObj);
    }

}
