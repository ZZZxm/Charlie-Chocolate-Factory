package team.charliechocolatefactory.machine.processmachine.state;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname StoppingState
 * @description describe the state when process machine is stopped
 * @date 2020/11/19 19:51
 */
public class StoppingState extends ProcessMachineState{
    /**
     * the door should be opened after the machine stopped
     */
    @Override
    public void open(){
        //change the state
        super.context.setProcessMachineState(Context.OPENNING_STATE);
        //open the door
        super.context.getProcessMachineState().open();
    }

    /**
     * the door is closed
     */
    @Override
    public void close() {

    }

    /**
     * the machine can run again after it stopped
     */
    @Override
    public void run() {
        //change the state
        super.context.setProcessMachineState(Context.RUNNING_STATE);
        //run
        super.context.getProcessMachineState().run();
    }

    /**
     * stop
     */
    @Override
    public void stop() {
        System.out.println("机器停止工作。");
    }
}
