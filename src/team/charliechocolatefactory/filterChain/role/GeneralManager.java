package team.charliechocolatefactory.filterChain.role;

import team.charliechocolatefactory.filterChain.message.Message;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname GeneralManager
 * @description GeneralManager
 * @date 2020/11/15 18:06
 */
public class GeneralManager extends Person {

    /**
     * Distinguish by name to prevent repeated addition of filter chain
     */
    private String personName = "GeneralManager";


    /**
     * This method is used to process messages.
     * If you do not agree to the request,
     * it will return false. If you agree, it will be submitted to the next level for approval.
     * If you are the last level, you will return true.
     * @param requestMessage：sendMessage
     * @return Processing results
     */
    @Override
    public boolean HandleRequest(Message requestMessage) {
        if (successor != null){
            return HandleRequest(requestMessage);
        }else {
            return true;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralManager)){
            return false;
        }
        GeneralManager temp = (GeneralManager) obj;
        return this.personName.equals(temp.personName);
    }
}
