package team.charliechocolatefactory.product.memento;

/**
 * @author lsy Brian.Z
 * @project chocolateFactory
 * @classname ProductMemento
 * @description ProductMemento in ProductMemento pattern
 * @date 2020/11/19 23:51
 */
public class ProductMemento {

    /**
     * the weight of this product's single item
     * correspond to param "weight" of Product
     */
    private int weight;

    public ProductMemento(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
