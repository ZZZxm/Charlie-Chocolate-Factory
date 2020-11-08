package team.charliechocolatefactory.machine;

import java.util.Random;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname Machine
 * @description This is the abstract base class of all the machines in the factory.
                Basic class Machine includes 7 private attributes, 2 protected attributes.
 * @date 2020/11/7 19:55
 */
public abstract class Machine {
    /**
     * machine type
     * eg:PR for production machine, PA for packing machine, TR for transport machine
     */
    private String type;
    /**
     * number under this type
     * combined with type to constitute machine ID
     * eg:PR101
     */
    private String machineNum;
    //machine service life, unit: year
    private double age=0;
    //maximum machine service life, unit: year
    private double lifeYear=20;
    //the benchmark value of each lost life
    private double lossCoefficient=0.5;
    //increased life of the machine after each operation, unit: year
    private double agingSpeed=0.5;
    private int maxCapacity=500;
    protected int aimProcessNum=0;
    protected boolean breakDown=false;

    public Machine(String type,String machineNum)
    {
        this.type=type;
        this.machineNum=machineNum;
    }

    public Machine(String type,String machineNum,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        this.type=type;
        this.machineNum=machineNum;
        this.lifeYear=lifeYear;
        this.lossCoefficient=lossCoefficient;
        this.maxCapacity=maxCapacity;
        this.agingSpeed=lossCoefficient;
    }

    public Machine(String type,String machineNum,double age,double lifeYear,double lossCoefficient,int maxCapacity)
    {
        this.type=type;
        this.machineNum=machineNum;
        this.age=age;
        this.lifeYear=lifeYear;
        this.lossCoefficient=lossCoefficient;
        this.maxCapacity=maxCapacity;
        this.agingSpeed=lossCoefficient;
    }

    /**
     * getType
     * @return a String
     */
    public String getType() {
        return type;
    }

    /**
     * getMachineNum
     * @return a String
     */
    public String getMachineNum() {
        return machineNum;
    }

    /**
     * getMachineID:'type'+'machineNum'
     * @return a String
     */
    public String getMachineID() {
        return type+machineNum;
    }

    /**
     * getAge
     * @return a double
     */
    public double getAge() {
        return age;
    }

    /**
     * getLifeYear
     * @return a double
     */
    public double getLifeYear() {
        return lifeYear;
    }

    public double getLossCoefficient() {
        return lossCoefficient;
    }

    public int getAimProcessNum() {
        return aimProcessNum;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean isBreakDown() {
        return breakDown;
    }

    protected void malfunction(){
        breakDown=true;
    }

    public void fix(){
        breakDown=false;
    }

    public void maintenance(){
        Random rand = new Random();
        int ageLonged = rand.nextInt(5);
        lifeYear=lifeYear+lifeYear*ageLonged*0.01;
    }

    /**
     * setMachineNum: prevent incorrect numbering situations
     * @param machineNum only param
     */
    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum;
    }

    /**
     * modify age by the agingSpeed
     * @return a double representing the age after increasing
     */
    public double increaseAge() {
        age = age+agingSpeed;
        return age;
    }

    public void setAimProcessNum(int aimProcessNum)
    {
        if(aimProcessNum> maxCapacity)
        {
            System.out.println("Exceed maxCapacity!");
            return;
        }
        if(aimProcessNum<=0)
        {
            System.out.println("AimProcessNum must be a positive integer!");
            return;
        }
        this.aimProcessNum =aimProcessNum;
        //adjust the machine aging speed according to the target production number
        this.agingSpeed=lossCoefficient+(1.0*aimProcessNum)/maxCapacity;
    }


    /**
     * work process and consequence
     * @return a int representing the output of this work
     */
    public abstract int work(Product product,int productNum);
}
