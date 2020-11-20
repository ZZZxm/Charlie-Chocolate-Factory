package team.charliechocolatefactory.person.stockholder;

import team.charliechocolatefactory.person.filterchain.message.Message;
import team.charliechocolatefactory.person.staff.Person;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Shareholder
 * @description Shareholder
 * @date 2020/11/15 18:05
 */
public class Shareholder extends Person {

    /**
     * Distinguish by name to prevent repeated addition of filter chain
     */
    private String personName = "Shareholder";


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
        if (!(obj instanceof Shareholder)){
            return false;
        }
        Shareholder temp = (Shareholder) obj;
        return this.personName.equals(temp.personName);
    }
}
