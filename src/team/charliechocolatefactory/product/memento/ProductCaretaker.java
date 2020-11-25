package team.charliechocolatefactory.product.memento;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname ProductCaretaker
 * @description ProductCaretaker in ProductMemento pattern
 * @date 2020/11/19 23:57
 */
public class ProductCaretaker {

    private ProductMemento productMemento;

    public void setProductMemento(ProductMemento productMemento) {
        this.productMemento = productMemento;
    }

    public ProductMemento getProductMemento() {
        return productMemento;
    }



}
