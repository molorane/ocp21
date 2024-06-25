package com.blessing.threads.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class BeeperControl {

    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public void beepForAnHour() {
        final ScheduledFuture<?> beeperHandle =
                scheduler.scheduleAtFixedRate(() -> System.out.println("beep"), 1, 3, TimeUnit.SECONDS);
        scheduler.schedule(() -> beeperHandle.cancel(true), 20, TimeUnit.SECONDS);
        scheduler.shutdown();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new BeeperControl().beepForAnHour();
    }

}
