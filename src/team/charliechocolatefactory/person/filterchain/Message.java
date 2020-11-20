package team.charliechocolatefactory.person.filterchain;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Message
 * @description Our base class for passing messages
 * @date 2020/11/15 18:00
 */
public abstract class Message {

    /**
     * Content of specific message
     */
    protected String messageInfo;

    /**
     * Construct method, set our information
     *
     * @param messageInfo
     */
    public Message(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    /**
     * @return: get class message
     */
    public String getMessageInfo() {
        return messageInfo;
    }

    /**
     * @param messageInfo:set message
     */
    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }
}
