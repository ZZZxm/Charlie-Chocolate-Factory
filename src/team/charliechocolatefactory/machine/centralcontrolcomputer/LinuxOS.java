package team.charliechocolatefactory.machine.centralcontrolcomputer;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname LinuxOS
 * @description OS of Linux system
 * @date 2020/11/20 22:14
 */
public class LinuxOS implements OperatingSystem {

    @Override
    public String startupInfo() {
        return "This is Linux OS booting...";
    }

}
