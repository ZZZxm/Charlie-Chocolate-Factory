package team.charliechocolatefactory.filterChain.role;

import team.charliechocolatefactory.person.filterchain.Message;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Person
 * @description TODO
 * @date 2020/11/15 17:58
 */
public abstract class Person {

    protected Person successor;

    public void SetSuccessor(Person handler) {
        this.successor = handler;
    }

    public Person getSuccessor() {
        return successor;
    }

    public abstract boolean HandleRequest(Message requestMessage);
}
