package team.charliechocolatefactory.factory;

import team.charliechocolatefactory.factory.support.PeriodicMaintenance;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname CharlieFactory
 * @description
 * @date 2020/11/7 17:50
 */
public class CharlieFactory {

    static private PeriodicMaintenance periodicMaintenance;

    public CharlieFactory() {
        periodicMaintenance = new PeriodicMaintenance();
    }

    public static PeriodicMaintenance getPeriodicMaintenance() {
        return periodicMaintenance;
    }

}
