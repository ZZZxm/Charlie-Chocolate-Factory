package team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy;

import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.packagematerial.Box;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname BoxWrapStrategy
 * @description wrap a chocolate or a chocolate package with a box
 * @date 2020/11/13 21:20
 */
public class BoxWrapStrategy extends WrapStrategy {

    @Override
    public void packaging(Product product) {

        // TODO 产品的toString可改
        System.out.println("Start packaging " + product.toString() + " with a box...");
        product.setPack(new Box());
        product.gotoNextState();
        System.out.println("Finish packaging.");
        product.gotoNextState();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProducedDate(df.format(day));
    }
}
