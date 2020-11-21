package team.charliechocolatefactory.machine.processmachine.state;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname ClosingState
 * @description describe the state when process machine close the door
 * @date 2020/11/19 19:51
 */
public class ClosingState extends ProcessMachineState{
    /**
     * the door can be opened in this state
     */
    @Override
    public void open(){
        //change the state
        super.context.setProcessMachineState(Context.OPENNING_STATE);
        //open the door
        super.context.getProcessMachineState().open();
    }

    /**
     * close the door
     */
    @Override
    public void close() {
        System.out.println("关门，请当心！");
    }

    /**
     * run after the door is closed
     */
    @Override
    public void run() {
        //change the state
        super.context.setProcessMachineState(Context.RUNNING_STATE);
        //run
        super.context.getProcessMachineState().run();
    }

    /**
     * the door closed but something went wrong
     */
    @Override
    public void stop() {
        //change the state
        super.context.setProcessMachineState(Context.STOPPING_STATE);
        //stop
        super.context.getProcessMachineState().stop();
    }
}
