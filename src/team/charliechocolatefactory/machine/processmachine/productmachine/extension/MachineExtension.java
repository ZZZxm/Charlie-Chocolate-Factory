package team.charliechocolatefactory.machine.processmachine.productmachine.extension;

import team.charliechocolatefactory.product.Product;

public interface MachineExtension extends Extension {
    int continueWork(int workNum, Product product);
}
