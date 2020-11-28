package team.charliechocolatefactory.machine.processmachine.qualitytestmachine.qualitytestsystem;

import team.charliechocolatefactory.machine.processmachine.qualitytestmachine.QualityTestMachine;

/**
 * @author TT
 * @project chocolateFactory
 * @classname QualityTestSystem
 * @description This is quality test system
 * @date 2020/11/14 18:00
 */
public abstract class QualityTestSystem extends QualityTestMachine {
    /**
     * Represent the the machine
     */
    private String species;

    /**
     * Represent the quality test system
     */
    public QualityTestSystem(String species){
        super(species);
        this.species = species;
    }
    public QualityTestSystem(String type, String machineNum) {
        super(type, machineNum, 50, 1.2, 500);
    }

    /**
     * Add the quality test system
     */
    protected abstract void add(QualityTestSystem qualityTestSystem);

    /**
     * Show the structure of the system
     */
    public void show() {
        this.show(0);
    }

    protected abstract void show(int depth);

    public String getSpecies() {
        return species;
    }

}
