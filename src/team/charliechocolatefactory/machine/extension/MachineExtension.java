package team.charliechocolatefactory.machine.extension;

import team.charliechocolatefactory.product.Product;

public interface MachineExtension extends Extension {
    int continueWork(int workNum, Product product);
}
