package team.charliechocolatefactory.scene.staffarea.manufacturingarea.WorkerIterator;

import team.charliechocolatefactory.person.staff.worker.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname WorkerListIterator
 * @description TODO
 * @date 2020/11/16 9:54
 */
public class WorkerListIterator implements Iterator {

    private ArrayList<Worker> workerList = null;
    private int index = -1;

    public WorkerListIterator() {
        workerList = new ArrayList<Worker>();
    }

    public WorkerListIterator(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }


    //Point to the first element, (the first element that can be simply modified to satisfy the condition, the same below)
    @Override
    public Worker first() {
        index = 0;
        return workerList.get(index);
    }

    //Point to the next element
    @Override
    public Worker next() {
        if (this.hasNext()) {
            return workerList.get(++index);
        }
        return null;
    }

    //Determine if there is the next element
    @Override
    public boolean hasNext() {
        if (index < workerList.size() - 1) {
            return true;
        }
        return false;
    }

    public Worker last() {
        index = workerList.size() - 1;
        return workerList.get(index);
    }

    public Worker previous() {
        return workerList.get(--index);
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(ArrayList<Worker> workerList) {
        this.workerList = workerList;
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
