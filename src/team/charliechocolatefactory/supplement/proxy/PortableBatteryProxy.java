package team.charliechocolatefactory.supplement.proxy;

/**
 * @author TT
 * @project chocolateFactory
 * @classname PortableBatteryProxy
 * @description TODO
 * @date 2020/11/18 13:28
 */
public class PortableBatteryProxy implements PortableBatterySubject{

    private PortableBattery portableBatteryInstance;
    public PortableBatteryProxy(PortableBattery tool)
    {
        this.portableBatteryInstance = tool;
    }

    @Override
    public boolean take() {
        if (portableBatteryInstance==null)
        {
            portableBatteryInstance=new PortableBattery();
        }
        preTake();
        boolean out=portableBatteryInstance.take();
        postTake();

        return out;
    }
    public void preTake()
    {
        System.out.println("Doing preTake functions");
    }
    public void postTake()
    {
        System.out.println("Doing postTake functions");
    }

    @Override
    public boolean returnPortableBattery() {
        if (portableBatteryInstance==null)
        {
            portableBatteryInstance=new PortableBattery();
        }
        preReturn();
        boolean out=portableBatteryInstance.returnPortableBattery();
        postReturn();

        return out;
    }
    public void preReturn()
    {
        System.out.println("Doing preReturn functions");
    }
    public void postReturn()
    {
        System.out.println("Doing postReturn functions");
    }

    public PortableBattery getPortableBatteryInstance() {
        return portableBatteryInstance;
    }

    public void setPortableBatteryInstance(PortableBattery portableBatteryInstance) {
        this.portableBatteryInstance = portableBatteryInstance;
    }

    @Override
    public String toString() {
        return "class PortableBatteryProxy implements PortableBatterySubject";
    }
}
