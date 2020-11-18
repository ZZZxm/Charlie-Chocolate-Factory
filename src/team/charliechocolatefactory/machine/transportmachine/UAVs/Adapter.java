package team.charliechocolatefactory.machine.transportmachine.UAVs;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @project chocolateFactory
 * @author: Miracle Ray
 * @classname Adapter
 * @description: Adapter Pattern to implement UAV's work function
 * @date: 2020/11/17 16:35
 */
public class Adapter implements UAV{
    private TransportMachine adaptee;
    private String mID;
    @Override
    public int work(){

        System.out.println(this.adaptee.getAimProcessNum()+" items transported successfully.");
        return 0;
    }
     @Override
     public int work(Product product){
        String pdName=product.getName();
        System.out.println(this.adaptee.getAimProcessNum()+" "+pdName+" transported successfully.");
        return 0;
     }
    @Override
    public void setID(String ID) {
        this.mID=ID;
    }
    @Override
    public String getID() {
        return this.mID;
    }
    @Override
    public void navigate() {
        System.out.println("UAV "+this.mID+" is navigating to destination.");
    }

    public Adapter(){}

    public Adapter(TransportMachine adaptee){this.adaptee=adaptee;}

    public TransportMachine getAdaptee(){return adaptee;}

    public void setAdaptee(TransportMachine adaptee){this.adaptee=adaptee;}

    @Override
    public String toString() {
        return "class Adapter implements UAV";
    }
}
