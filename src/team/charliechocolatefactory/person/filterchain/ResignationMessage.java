package team.charliechocolatefactory.person.filterchain;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ResignationMessage
 * @description ResignationMessage
 * @date 2020/11/15 18:01
 */
public class ResignationMessage extends Message {

    /**
     * message type,The types of information users distinguish
     */
    private String MessageType = "resignation";

    public ResignationMessage(String messageInfo) {
        super(messageInfo);
    }

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String messageType) {
        MessageType = messageType;
    }
}
