package team.charliechocolatefactory.person.staff.worker;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import javafx.scene.Scene;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WarehouseWorker
 * @description TODO
 * @date 2020/11/9 22:06
 */
public class WarehouseWorker extends Worker {

    public WarehouseWorker(String name, int age, Sex sex, int salary, Scene department) {
        super(name, age, sex, salary, department);
    }

    @Override
    public void work() {
        System.out.println("Warehouse Worker" + this.name + "is working.");
    }
}
