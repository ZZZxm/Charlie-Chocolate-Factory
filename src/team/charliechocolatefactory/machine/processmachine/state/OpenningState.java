package team.charliechocolatefactory.machine.processmachine.state;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname OpenningState
 * @description describe the state when process machine open the door
 * @date 2020/11/19 19:50
 */
public class OpenningState extends ProcessMachineState{
    /**
     * open the door
     */
    @Override
    public void open(){
        System.out.println("开门，请当心！");
    }

    /**
     * the door can be closed in this state
     */
    @Override
    public void close() {
        //change the state
        super.context.setProcessMachineState(Context.CLOSING_STATE);
        //close the door
        super.context.getProcessMachineState().close();
    }
    /**
     * the door is open so it cannot run
     */
    @Override
    public void run() {

    }
    /**
     * the door is open so it has stopped
     */
    @Override
    public void stop() {

    }
}
