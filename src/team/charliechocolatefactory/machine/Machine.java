package team.charliechocolatefactory.machine;
import team.charliechocolatefactory.product.Product;

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
    //the benchmark value of each increased age, unit: year
    private double lossCoefficient=0.5;
    //increased age value of the machine after each operation, unit: year
    private double agingSpeed=0.5;
    //maximum number of items produced (processed) by the machine at one time
    private int maxCapacity=500;
    //the number of products the machine is set to produce at one time
    protected int aimProcessNum=0;
    //indicating whether the machine is in malfunction
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

    /**
     * getLossCoefficient
     * @return a double
     */
    public double getLossCoefficient() {
        return lossCoefficient;
    }

    /**
     * getAimProcessNum
     * @return a int
     */
    public int getAimProcessNum() {
        return aimProcessNum;
    }

    /**
     * getMaxCapacity
     * @return a int
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * isBreakDown
     * @return a boolean
     */
    public boolean isBreakDown() {
        return breakDown;
    }

    /**
     * set breakDown to true, called when something wrong occurs
     */
    protected void malfunction(){
        breakDown=true;
        System.out.println("Oh no! "+type+machineNum+" breaks down! Please fix!\n");
    }

    /**
     * set breakDown to false, called when fix work finishes
     */
    public void fix(){
        if(breakDown)
        {
            breakDown=false;
            System.out.println("Fix finished, "+type+machineNum+" can work again!\n");
        }
        else
        {
            System.out.println("There is nothing to be fixed.\n");
        }
    }

    /**
     * artificial maintenance of machinery to extend its service life
     */
    public void maintenance(){
        Random rand = new Random();
        int ageLonged = rand.nextInt(5);
        lifeYear=lifeYear+lifeYear*ageLonged*0.01;
        System.out.println("Maintenance work is completed, and the life of "+type+machineNum+" is extended to "+lifeYear+" years.\n");
    }

    /**
     * setMachineNum: prevent incorrect numbering situations
     * @param machineNum only param
     */
    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum;
        System.out.println("The code number of the machine is changed to "+machineNum+".\n");
    }

    /**
     * modify age by the agingSpeed
     * @return a double representing the age after increasing
     */
    public double increaseAge() {
        age = age+agingSpeed;
        System.out.println("The age of "+type+machineNum+" increases to "+age+" years.\n");
        if(age==lifeYear)
        {
            System.out.println(type+machineNum+" has reached its end life.\n");
            System.out.println("Please maintenance "+type+machineNum+" or change a machine to run next time.\n");
        }
        return age;
    }

    /**
     * usually called before working, set the number of products the machine is to produce at one time
     * default aimProcessNum is 0, so this function have to be called before first working
     * @param aimProcessNum a int
     */
    public void setAimProcessNum(int aimProcessNum)
    {
        if(aimProcessNum> maxCapacity)
        {
            System.out.println("Exceed maxCapacity!\n");
            return;
        }
        if(aimProcessNum<=0)
        {
            System.out.println("AimProcessNum must be a positive integer!\n");
            return;
        }
        this.aimProcessNum =aimProcessNum;
        //adjust the machine aging speed according to the target production number
        this.agingSpeed=lossCoefficient+(1.0*aimProcessNum)/maxCapacity;
        System.out.println("Set aimProcessNum to "+aimProcessNum+".\n");
        System.out.println("The agingSpeed of "+type+machineNum+" changes to"+agingSpeed+".\n");
    }

    /**
     * work process
     * @return a int
     */
    protected abstract int work(Product product);

    /**
     * run process
     * @return a int representing output product numbers
     */
    public int run(Product product)
    {
        double virtualAge=age+agingSpeed;
        if(virtualAge>lifeYear)
        {
            System.out.println(type+machineNum+"'s remaining life is not sufficient to support this operation.\n");
            System.out.println("Please maintenance "+type+machineNum+" or change a machine to run.\n");
            return 0;
        }
        if(aimProcessNum==0)
        {
            System.out.println("Please set "+type+machineNum+"'s aimProcessNum first.\n");
            return 0;
        }
        System.out.println(type+machineNum+" starts to tun:\n");
        return work(product);
    }

    public String toString() {
        return "class Machine";
    }
}
