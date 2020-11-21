package team.charliechocolatefactory.machine.centralcontrolcomputer;

/**
 * @project chocolateFactory
 * @classname LinuxOS
 * @description TODO
 * @author Ngae Zeh-ghau
 * @date 2020/11/20 22:14
 */
public class LinuxOS implements OperatingSystem {

	@Override
	public String startupInfo() {
		return "This is Linux OS booting...";
	}
	
}
