package team.charliechocolatefactory.supplement.proxy;

/**
 * @author TT
 * @project chocolateFactory
 * @classname PortableBattery
 * @description TODO
 * @date 2020/11/18 13:28
 */
public class PortableBattery implements PortableBatterySubject {
    private static int id_count = 100000;

    protected int id;

    protected boolean isOccupied;


    public PortableBattery() {
        this.id = id_count++;
//        this.context = new ToolContext();
        this.isOccupied = false;
    }

    public boolean take() {
        if (this.isOccupied) {
            System.out.println("This tool has been taken!");
            return false;
        }

        System.out.println("Take this tool!");
        this.isOccupied = true;
        return true;
    }

    public boolean returnPortableBattery() {
        if (!this.isOccupied) {
            System.out.println("This tool hasn't been taken!");
            return false;
        }

        System.out.println("Return this tool!");
        this.isOccupied = false;
        return true;
    }


    public int getToolId() {
        return this.id;
    }

    public static int getId_count() {
        return id_count;
    }

    public static void setId_count(int id_count) {
        PortableBattery.id_count = id_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "class PortableBattery  implements PortableBatterySubject";
    }
}
