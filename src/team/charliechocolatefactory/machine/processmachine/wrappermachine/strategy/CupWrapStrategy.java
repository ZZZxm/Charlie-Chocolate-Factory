package team.charliechocolatefactory.machine.processmachine.wrappermachine.strategy;

import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.rawmaterial.packagematerial.Cup;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname CupWrapStrategy
 * @description wrap a chocolate or a chocolate package with a cup
 * @date 2020/11/13 21:21
 */
public class CupWrapStrategy extends WrapStrategy {

    @Override
    public void packaging(Product product) {

        // TODO 产品的toString可改
        System.out.println("Start packaging " + product.toString() + " with a cup...");
        product.setPack(new Cup());
        product.gotoNextState();
        System.out.println("Finish packaging.");
        product.gotoNextState();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProducedDate(df.format(day));
    }
}
