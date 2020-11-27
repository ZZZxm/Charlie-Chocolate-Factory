package team.charliechocolatefactory.machine.centralcontrolcomputer;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname BootLoader
 * @description boot loader
 * @date 2020/11/20 22:14
 */
public class BootLoader {

    Class<? extends OperatingSystem> osClass = null;

    /**
     * Bind this class with class implements OperatingSystem.
     *
     * @param osClass class to bind
     */
    public void bindOS(Class<? extends OperatingSystem> osClass) {
        try {
            this.osClass = osClass;
        } catch (Exception e) {
            System.out.println("Cannot bind to this class! Set to null.");
            this.osClass = null;
        }
    }

    public void loadOSTo(CentralControlComputer computer) {
        try {
            computer.loadOS(osClass.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println("Cannot load OS of type" + osClass.getSimpleName() + "!");
        }
    }

    /**
     * test of IoC pattern
     *
     * @param dummy dummy
     */
    public static void main(String[] dummy) {
        BootLoader bootLoader = new BootLoader();
        CentralControlComputer computer = new CentralControlComputer();
        CentralControlComputer anotherComputer = new CentralControlComputer();
        bootLoader.bindOS(WindowsOS.class);
        bootLoader.loadOSTo(computer);
        // the following line should print "This is Windows OS booting..."
        computer.boot();
        bootLoader.bindOS(LinuxOS.class);
        bootLoader.loadOSTo(anotherComputer);
        // the following line should print "This is Linux OS booting..."
        anotherComputer.boot();
    }

}
