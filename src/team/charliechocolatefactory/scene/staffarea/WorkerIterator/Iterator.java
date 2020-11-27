package team.charliechocolatefactory.scene.staffarea.WorkerIterator;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname Iterator
 * @description All iterators should implement this interface so that they can be iterators.
 * @date 2020/11/15 19:45
 */
public interface Iterator {

    Object first();

    Object next();

    boolean hasNext();
}
