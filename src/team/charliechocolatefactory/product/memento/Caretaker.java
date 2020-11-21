package team.charliechocolatefactory.product.memento;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname Caretaker
 * @description Caretaker in Memento pattern
 * @date 2020/11/19 23:57
 */
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento memento){
        this.memento = memento;
    }
    public Memento getMemento(){
        return memento;
    }
}
