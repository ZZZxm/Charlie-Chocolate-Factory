package team.charliechocolatefactory.person.filterchain;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ApplicationMessage
 * @description ApplicationMessage
 * @date 2020/11/15 18:01
 */
public class ApplicationMessage extends Message {

    /**
     * message type,The types of information users distinguish
     */
    private String MessageType = "application";

    public ApplicationMessage(String messageInfo) {
        super(messageInfo);
    }

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String messageType) {
        MessageType = messageType;
    }
}
