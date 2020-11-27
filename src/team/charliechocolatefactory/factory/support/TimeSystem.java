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

    /**
     * current day
     */
    private int curDay;

    /**
     * current hour
     */
    private int curHour;

    /**
     * timer service
     */
    private ScheduledExecutorService service;

    /**
     * constructor of TimeSystem
     */
    public TimeSystem() {
        Runnable runnable = new Runnable() {
            public void run() {
                tick();
            }
        };

        service = Executors.newSingleThreadScheduledExecutor();

        service.scheduleAtFixedRate(runnable, 0, 3, TimeUnit.SECONDS);

    }

    /**
     * check the cleaning and aging condition of the factory every once in a while
     */
    public void tick() {

        curHour++;

        if (curHour == 24) {
            curHour = 0;
            curDay++;
        }

        if (curDay == 366) {
            curDay = 1;
        }

        System.out.printf("current hour: %d, current day: %d.%n", curHour, curDay);

        /*
        if (curHour == 6) {
            CharlieFactory.getPeriodicMaintenance().setDirtyTrue();
        }

        if (curDay == 62) {
            CharlieFactory.getPeriodicMaintenance().setAgingTrue();
        }

        if (CharlieFactory.getPeriodicMaintenance().getDirtyFlag()) {
            CharlieFactory.getPeriodicMaintenance().doClean();
        }

        if (CharlieFactory.getPeriodicMaintenance().getAgingFlag()) {
            CharlieFactory.getPeriodicMaintenance().doMaintenance();
        }
         */
    }

    /**
     * stop the timer
     */
    public void stopTimeSystem() {
        service.shutdownNow();
    }

}
