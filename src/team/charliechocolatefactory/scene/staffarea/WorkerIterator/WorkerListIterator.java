package team.charliechocolatefactory.scene.staffarea.WorkerIterator;

import team.charliechocolatefactory.person.staff.worker.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname WorkerListIterator
 * @description iterator of a worker list
 * @date 2020/11/16 9:54
 */
public class WorkerListIterator implements Iterator {

    /**
     * the list of the workers
     */
    private ArrayList<Worker> workerList = null;

    /**
     * current index of the iterator
     */
    private int index = -1;

    public WorkerListIterator() {
        workerList = new ArrayList<Worker>();
    }

    public WorkerListIterator(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }


    /**
     * make the index points to the first element
     *
     * @return the first element
     */
    @Override
    public Worker first() {
        index = 0;
        return workerList.get(index);
    }

    /**
     * make the index points to the next element
     *
     * @return the next element
     */
    @Override
    public Worker next() {
        if (this.hasNext()) {
            return workerList.get(++index);
        }
        return null;
    }

    /**
     * determine if there exists the next element
     *
     * @return true if there exists the next element
     */
    @Override
    public boolean hasNext() {
        return index < workerList.size() - 1;
    }

    /**
     * make the index points to the last element
     *
     * @return the last element
     */
    public Worker last() {
        index = workerList.size() - 1;
        return workerList.get(index);
    }

    /**
     * make the index points to the previous element
     *
     * @return the previous element
     */
    public Worker previous() {
        return workerList.get(--index);
    }


    public List<Worker> getWorkerList() {
        return new ArrayList<>(workerList);
    }

    public void setWorkerList(ArrayList<Worker> workerList) {
        this.workerList = new ArrayList<Worker>(workerList);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "class WorkerListIterator implements Iterator";
    }

}
