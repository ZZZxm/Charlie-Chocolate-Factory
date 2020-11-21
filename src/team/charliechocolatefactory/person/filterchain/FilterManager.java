package team.charliechocolatefactory.person.filterchain.manager;

import team.charliechocolatefactory.person.filterchain.message.Message;
import team.charliechocolatefactory.person.staff.Person;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname FilterManager
 * @description Our filter chain manager is mainly used to operate our processing objects, processing information, etc.
 * @date 2020/11/15 18:08
 */
public class FilterManager {

    /**
     * Our root handler
     */
    private Person rootPerson;

    /**
     * Current last processor
     */
    private Person currentPerson;

    /**
     * The message we need to deliver
     */
    private Message message;

    /**
     * Methods for performing messaging;
     *
     * @param message passed in at the beginning of the method
     */
    public boolean doFilterMessage(Message message) {
        this.message = message;
        return doFilterMessage();
    }

    /**
     * This method can dynamically add the handler we need to enhance the flexibility of the code.
     *
     * @param person:Added handler
     * @return:Is the addition successful
     */
    public boolean addPersonProcess(Person person) {
        /*
         * If NULL is passed in, false is returned directly
         */
        if (person == null) {
            return false;
        }
        /*
         * If the root node is empty, put it directly into our root node;
         */
        if (rootPerson == null) {
            this.rootPerson = person;
            this.currentPerson = person;
            return true;
        }

        Person temp = person;
        /*
         * Loop through whether there are duplicate nodes. If there are duplicate nodes, insert is rejected.
         */
        while (temp != null) {
            if (person.equals(temp)) {
                return false;
            }
            temp = temp.getSuccessor();
        }
        /*
         * The last node points to our newly added node.
         */
        currentPerson.SetSuccessor(person);
        currentPerson = person;
        return true;
    }

    /**
     * The method of executing message passing to deliver message.
     *
     * @return:message is success filter;
     */
    public boolean doFilterMessage() {
        if (this.message == null) {
            throw new RuntimeException("message must not null!");
        }
        return rootPerson.HandleRequest(this.message);
    }

    /**
     * Get our message
     *
     * @return:Get our message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Set up the message we send
     *
     * @param message:send message;
     */
    public void setMessage(Message message) {
        this.message = message;
    }

}
