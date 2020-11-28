package team.charliechocolatefactory.machine.transportmachine.UAVs;

import team.charliechocolatefactory.machine.transportmachine.TransportMachine;
import team.charliechocolatefactory.product.Product;

/**
 * @project chocolateFactory
 * @author: Miracle Ray
 * @classname UAV
 * @description: This is basic function of UAV. (UAV means unmanned aerial vehicle, in Chinese means 无人机)
 * @date: 2020/11/17 16:30
 */
public interface UAV {

    int work(Product product);

    void setID(String ID);

    String getID();

    void setAimProcessNum(int aimProcessNum);

    /**
     * @description The method UAV differ from normal transport machine.
     */
    void navigate();

}
