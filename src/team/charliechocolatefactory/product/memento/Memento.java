package team.charliechocolatefactory.product.memento;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname Memento
 * @description Memento in Memento pattern
 * @date 2020/11/19 23:51
 */
public class Memento {
    private String producedDate; // yyyy-mm-dd
    private String produceStaff;

    public Memento(String producedDate,String produceStaff){
        this.producedDate = producedDate;
        this.produceStaff = produceStaff;
    }
    public String getProducedDate(){
        return producedDate;
    }
    public void setProducedDate(String producedDate){
        this.producedDate = producedDate;
    }
    public String getProduceStaff(){
        return produceStaff;
    }
    public void setProduceStaff(String produceStaff){
        this.produceStaff = produceStaff;
    }
}
