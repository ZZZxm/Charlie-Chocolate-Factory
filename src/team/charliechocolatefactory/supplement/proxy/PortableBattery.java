package team.charliechocolatefactory.supplement.proxy;

/**
 * @author TT
 * @project chocolateFactory
 * @classname PortableBattery
 * @description This portable battery
 * @date 2020/11/18 13:28
 */
public class PortableBattery implements PortableBatterySubject {
    /**
     * Represent the number of the portable battery
     */
    private static int id_count = 100000;

    /**
     * Represent the index of the portable battery
     */
    protected int id;

    protected boolean isOccupied;

    /**
     * Create the portable battery
     */
    public PortableBattery() {
        this.id = id_count++;
//        this.context = new ToolContext();
        this.isOccupied = false;
    }

    /**
     * Take portable battery
     */
    public boolean take() {
        if (this.isOccupied) {
            System.out.println("This tool has been taken!");
            return false;
        }

        System.out.println("Take this tool!");
        this.isOccupied = true;
        return true;
    }

    /**
     * Return portable battery
     */
    public boolean returnPortableBattery() {
        if (!this.isOccupied) {
            System.out.println("This tool hasn't been taken!");
            return false;
        }

        System.out.println("Return this tool!");
        this.isOccupied = false;
        return true;
    }

    /**
     * Get the index of the portable battery
     */
    public int getId() {
        return id;
    }

    /**
     * Set the index of the portable battery
     */
    public void setId(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public String toString() {
        return "class PortableBattery  implements PortableBatterySubject";
    }
}
