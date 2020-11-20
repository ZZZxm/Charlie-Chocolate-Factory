package team.charliechocolatefactory.person.filterchain;

import team.charliechocolatefactory.person.filterchain.manager.FilterManager;
import team.charliechocolatefactory.person.filterchain.message.ApplicationMessage;
import team.charliechocolatefactory.person.filterchain.message.Message;
import team.charliechocolatefactory.person.staff.worker.Manager;
import team.charliechocolatefactory.person.stockholder.Shareholder;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Client
 * @description Client
 * @date 2020/11/15 18:34
 */
public class Client {

    public static void main(String[] args) {
        Message message = new ApplicationMessage("this message!");
        FilterManager manager = new FilterManager();
        manager.addPersonProcess(new Manager());
        manager.addPersonProcess(new Shareholder());
        System.out.println(manager.doFilterMessage(message));

    }

}
