package team.charliechocolatefactory.machine.processmachine.state;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname ProcessMachineState
 * @description define abstract class to describe the state of process machine
 * @date 2020/11/19 19:46
 */
public abstract class ProcessMachineState {
    protected Context context;

    public void setContext(Context context){
        this.context =  context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
