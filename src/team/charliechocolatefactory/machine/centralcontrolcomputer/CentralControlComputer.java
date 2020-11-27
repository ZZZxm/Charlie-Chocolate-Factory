package team.charliechocolatefactory.machine.centralcontrolcomputer;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname CentralControlComputor
 * @description Central control computer. This is a part of IoC pattern.
 * @date 2020/11/20 22:05
 */
public class CentralControlComputer {

    private OperatingSystem os = null;

    public CentralControlComputer() {
        /**
         * empty ctor required by IoC pattern
         */
    }

    /**
     * @param os the os to load (inject into this class)
     */
    public void loadOS(OperatingSystem os) {
        this.os = os;
    }

    public void boot() {
        if (os != null) {
            System.out.println(os.startupInfo());
        } else {
            System.out.println("No Operating System!");
        }
    }

}
