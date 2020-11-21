package team.charliechocolatefactory.product.memento;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname ProductRecord
 * @description Originator in Memento pattern
 * @date 2020/11/19 23:54
 */
public class ProductRecord {
    private String producedDate; // yyyy-mm-dd
    private String produceStaff;

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

    /**
     * display the record
     */
    public void recordDisplay(){
        System.out.println("当前产品生产日期："+this.producedDate);
        System.out.println("经手员工："+this.produceStaff);
    }

    public Memento createMemento(){
        return new Memento(producedDate,produceStaff);
    }
    public void recoveryMemento(Memento m){
        this.producedDate = m.getProducedDate();
        this.produceStaff = m.getProduceStaff();
    }
}
