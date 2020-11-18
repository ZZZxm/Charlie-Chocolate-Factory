package team.charliechocolatefactory.scene.staffarea.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Monitor
 * @description TODO
 * @date 2020/11/18 14:34
 */
public class Monitor extends ResidenceDecorator{

    public Monitor(){
    }

    public Monitor(Residence r){
        super(r);
        System.out.println("添加一个监视器");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 500; //table 500yuan/per
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "，加了一个监视器";
    }

    @Override
    public String toString() {
        return "class Monitor extends ResidenceDecorator";
    }
}