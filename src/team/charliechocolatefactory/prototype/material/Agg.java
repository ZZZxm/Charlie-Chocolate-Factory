package team.charliechocolatefactory.prototype.material;

import java.io.Serializable;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Agg
 * @description Raw materials of eggs
 * @date 2020/11/15 17:08
 */
public class Agg implements Cloneable, Serializable {

    /**
     * agg name;
     */
    private String name;

    /**
     * agg size;
     */
    private String size;


    /**
     * @return AggName
     */
    public String getName() {
        return name;
    }

    /**
     * @param name:AggName;
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return AggSize;
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size:AggSize;
     */
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
