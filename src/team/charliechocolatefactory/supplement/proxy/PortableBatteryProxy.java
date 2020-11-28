package team.charliechocolatefactory.supplement.proxy;

/**
 * @author TT
 * @project chocolateFactory
 * @classname PortableBatteryProxy
 * @description Proxy the portable battery
 * @date 2020/11/18 13:28
 */
public class PortableBatteryProxy implements PortableBatterySubject {

    private PortableBattery portableBatteryInstance;

    /**
     * Proxy the portable battery proxy
     */
    public PortableBatteryProxy(PortableBattery tool) {
        this.portableBatteryInstance = tool;
    }

    /**
     * Take the portable battery
     */
    @Override
    public boolean take() {
        if (portableBatteryInstance == null) {
            portableBatteryInstance = new PortableBattery();
        }
        preTake();
        boolean out = portableBatteryInstance.take();
        postTake();

        return out;
    }

    public void preTake() {
        //System.out.println("Doing preTake functions");
    }

    public void postTake() {
        //System.out.println("Doing postTake functions");
    }

    /**
     * Return the portable battery
     */
    @Override
    public boolean returnPortableBattery() {
        if (portableBatteryInstance == null) {
            portableBatteryInstance = new PortableBattery();
        }
        preReturn();
        boolean out = portableBatteryInstance.returnPortableBattery();
        postReturn();
        return out;
    }

    public void preReturn() {
        //System.out.println("Doing preReturn functions");
    }

    public void postReturn() {
        //System.out.println("Doing postReturn functions");
    }

    /**
     * Return the instance of portable battery
     */
    public PortableBattery getPortableBatteryInstance() {
        return portableBatteryInstance;
    }

    /**
     * Set the instance of the portable battery
     */
    public void setPortableBatteryInstance(PortableBattery portableBatteryInstance) {
        this.portableBatteryInstance = portableBatteryInstance;
    }

    @Override
    public String toString() {
        return "class PortableBatteryProxy implements PortableBatterySubject";
    }
}
