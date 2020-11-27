package team.charliechocolatefactory.scene.decorator;
import team.charliechocolatefactory.person.staff.worker.utilityworker.UtilityWorker;
import team.charliechocolatefactory.scene.decorator.Residence;
/**
 * @author TT
 * @project chocolateFactory
 * @classname Villa
 * @description TODO
 * @date 2020/11/24 20:30
 */
public class Villa extends Residence {
    private int villaNumber;

    public Villa(){
        super(50000);
        System.out.println("A villa has been built");
    }

//    public Villa(int villaNumber) {
//        this.villaNumber = villaNumber;
//    }
//
//    public Villa(double x, int villaNumber) {
//        super(x);
//        this.villaNumber = villaNumber;
//    }

    @Override
    public String getDescription() {
        return "This is a villa";
    }

//    public int getVillaNumber(){
//        return villaNumber;
//    }
//
//    public void setVillaNumber(int id){
//        villaNumber = id;
//    }


    @Override
    public String toString() {
        return "class Villa extends Residence";
    }

    @Override
    public void accept(UtilityWorker worker) {

    }
}
