package team.charliechocolatefactory.factory.support;

import team.charliechocolatefactory.factory.CharlieFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname TimeSystem
 * @description time system of chocolate factory
 * @date 2020/11/24 21:55
 */
public class TimeSystem {

    private int curDay, curHour;

    public TimeSystem() {
        Runnable runnable = new Runnable() {
            public void run() {
                tick();
            }
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.scheduleAtFixedRate(runnable, 0, 10, TimeUnit.SECONDS);

    }

    public void tick() {

        curHour++;

        if (curHour == 24) {
            curHour = 0;
            curDay++;
        }

        if (curDay == 366) {
            curDay = 1;
        }

        if (curHour == 6) {
            CharlieFactory.getPeriodicMaintenance().setDirty();
        }

        if (curDay == 62) {
            CharlieFactory.getPeriodicMaintenance().setAging();
        }

        if (CharlieFactory.getPeriodicMaintenance().getDirtyFlag()) {
            CharlieFactory.getPeriodicMaintenance().doClean();
        }

        if (CharlieFactory.getPeriodicMaintenance().getAgingFlag()) {
            CharlieFactory.getPeriodicMaintenance().doMaintenance();
        }

    }

}
