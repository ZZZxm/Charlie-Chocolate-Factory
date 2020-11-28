package team.charliechocolatefactory.machine.processmachine.productmachine.extension;

import team.charliechocolatefactory.product.Product;

public interface MachineExtension extends Extension {
    void continueWork(int workNum, Product product);
}
