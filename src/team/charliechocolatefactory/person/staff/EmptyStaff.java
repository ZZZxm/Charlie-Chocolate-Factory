package team.charliechocolatefactory.person.staff;


/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname EmptyWorker
 * @description Empty Object Pattern: used when finding a staff who doesn't exist
 * @date 2020/11/20 17:45
 */
public class EmptyStaff extends Staff {
    public EmptyStaff() {
        super(null, -1, null, -1, null);
    }


    @Override
    protected void setInitialAsset() {
        this.asset = -1;
    }

    /**
     * input no staff found
     */
    @Override
    public void display() {
        System.out.println("No staff found.");
    }
}
