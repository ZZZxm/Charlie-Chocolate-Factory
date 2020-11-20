package team.charliechocolatefactory.filterChain;

import team.charliechocolatefactory.filterChain.manager.FilterManager;
import team.charliechocolatefactory.filterChain.message.ApplicationMessage;
import team.charliechocolatefactory.filterChain.message.Message;
import team.charliechocolatefactory.filterChain.role.CommonManager;
import team.charliechocolatefactory.filterChain.role.Shareholder;

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
        manager.addPersonProcess(new CommonManager());
        manager.addPersonProcess(new Shareholder());
        System.out.println(manager.doFilterMessage(message));

    }

}
