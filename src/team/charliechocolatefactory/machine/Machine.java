package team.charliechocolatefactory.machine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname Machine
 * @description This is the abstract base class of all the machines in the factory.
                When a machine is constructed, you're required to provide 2 or 3 params.
                Basic class Machine includes 4 private attributes,
                only machineNum is allowed to change from outside once a machine is constructed.
                Basic class Machine includes 1 protected attributes, which can be visited by subclasses,
                default agingSpeed is 1 .
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
    private double age;
    //maximum machine service life, unit: year
    private double lifeYear;
    //increased life of the machine after each operation, unit: year
    protected double agingSpeed;


    /**
     * 'Machine' construction case one:3 params
     * @param type param1
     * @param machineNum param2
     */
    public Machine(String type,String machineNum)
    {
        this.type=type;
        this.machineNum=machineNum;
        this.age=0;
        this.agingSpeed=1;
    }

    /**
     * 'Machine' construction case two:4 params
     * @param type param1
     * @param machineNum param2
     * @param age param3
     */
    public Machine(String type,String machineNum,double age)
    {
        this.type=type;
        this.machineNum=machineNum;
        this.age=age;
        this.agingSpeed=1;
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

    /**
     * work process and consequence
     * @return a int representing the output of this work
     */
    public abstract int work(Product product,int productNum);
}
