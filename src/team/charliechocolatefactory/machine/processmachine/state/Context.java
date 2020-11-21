package team.charliechocolatefactory.machine.processmachine.state;

import team.charliechocolatefactory.machine.processmachine.ProcessMachine;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname Context
 * @description define all states of the machine and four methods
 * @date 2020/11/19 19:39
 */
public class Context {
    /**
     * define all states of the machine
     */
    public final static ProcessMachineState OPENNING_STATE = new OpenningState();
    public final static ProcessMachineState CLOSING_STATE = new ClosingState();
    public final static ProcessMachineState RUNNING_STATE = new RunningState();
    public final static ProcessMachineState STOPPING_STATE = new StoppingState();
    /**
     * define current state
     */
    private ProcessMachineState processMachineState;

    public ProcessMachineState getProcessMachineState(){
        return processMachineState;
    }

    /**
     * notify each implementation class
     * @param processMachineState
     */
    public void setProcessMachineState(ProcessMachineState processMachineState){
        this.processMachineState = processMachineState;
        this.processMachineState.setContext(this);
    }

    /**
     * four methods
     */
    public void open(){
        this.processMachineState.open();
    }
    public void close(){
        this.processMachineState.close();
    }
    public void run(){
        this.processMachineState.run();
    }
    public void stop(){
        this.processMachineState.stop();
    }
}
