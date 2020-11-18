package team.charliechocolatefactory.scene.staffarea.manufacturingarea.WorkerIterator;

import team.charliechocolatefactory.person.staff.worker.Worker;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname Iterator
 * @description All iterators should implement this interface so that they can be iterators.
 * @date 2020/11/15 19:45
 */
public interface Iterator {

    public Object first();

    public Object next();

    public boolean hasNext();
}
