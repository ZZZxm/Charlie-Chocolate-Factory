package team.charliechocolatefactory.machine.qualitytestmachine.qualitytestsystem;

import team.charliechocolatefactory.machine.qualitytestmachine.QualityTestMachine;

/**
 * @author TT
 * @project chocolateFactory
 * @classname QualityTestSystem
 * @description TODO
 * @date 2020/11/14 18:00
 */
public abstract class QualityTestSystem extends QualityTestMachine {
    private String species;


    public QualityTestSystem(String type, String machineNum)
    {
        super(type,machineNum,50,1.2,500);
    }

    public QualityTestSystem(String type,String machineNum,double age)
    {
        super(type,machineNum,age,50,1.2,500);
    }

    protected abstract void add(QualityTestSystem qualityTestSystem);

    public void show() { this.show(0); }

    protected abstract void show(int depth);

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species){
        this.species = species;
    }


}
