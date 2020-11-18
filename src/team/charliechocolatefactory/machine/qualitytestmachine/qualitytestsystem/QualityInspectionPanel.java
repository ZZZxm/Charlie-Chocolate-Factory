package team.charliechocolatefactory.machine.qualitytestmachine.qualitytestsystem;

/**
 * @author TT
 * @project chocolateFactory
 * @classname QualityInspectionPanel
 * @description TODO
 * @date 2020/11/14 18:00
 */
public class QualityInspectionPanel extends QualityTestSystem{
    public QualityInspectionPanel(String type, String machineNum) {
        super(type, machineNum);
    }

    @Override
    protected void add(QualityTestSystem qualityTestSystem){
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getSpecies());
    }
    public String toString() {
        return "class QualityInspectionPanel";
    }
}
