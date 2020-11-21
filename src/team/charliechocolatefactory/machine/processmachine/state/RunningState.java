package team.charliechocolatefactory.machine.processmachine.state;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname RunningState
 * @description describe the state when process machine is running
 * @date 2020/11/19 19:51
 */
public class RunningState extends ProcessMachineState{
    /**
     * cannot open the door while running
     */
    @Override
    public void open(){

    }

    /**
     * the door is closed while running
     */
    @Override
    public void close() {

    }

    /**
     * running
     */
    @Override
    public void run() {
        System.out.println("机器正在运行中。");
    }

    /**
     *can be stopped after running
     */
    @Override
    public void stop() {
        //change the state
        super.context.setProcessMachineState(Context.STOPPING_STATE);
        //stop
        super.context.getProcessMachineState().stop();
    }
}
