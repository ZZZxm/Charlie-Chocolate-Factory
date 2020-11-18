package team.charliechocolatefactory.machine.qualitytestmachine.qualitytestsystem;
import java.util.ArrayList;
import java.util.List;
/**
 * @author TT
 * @project chocolateFactory
 * @classname QualityInspectionPanelGroup
 * @description TODO
 * @date 2020/11/14 18:010
 */
public class QualityInspectionPanelGroup extends QualityTestSystem{
    private List<QualityTestSystem> succulents = new ArrayList<QualityTestSystem>();

    public QualityInspectionPanelGroup(String type, String machineNum, List<QualityTestSystem> succulents) {
        super(type, machineNum);
        this.succulents = succulents;
    }

    @Override
    protected void add(QualityTestSystem qualityTestSystem) {

    }

    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getSpecies() + " Cluster:");
        for (QualityTestSystem suc : succulents) {
            suc.show(depth + 2);
        }
    }
}
