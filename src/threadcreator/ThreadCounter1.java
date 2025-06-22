package threadcreator;

import java.util.concurrent.TimeUnit;

public class ThreadCounter1 implements Runnable{

    double startFrom;

    public ThreadCounter1(double startFrom) {
        this.startFrom = startFrom;
    }

    @Override
    public void run() {
        for (SharedCounter.sharedCounter = startFrom; SharedCounter.sharedCounter >= 0; SharedCounter.sharedCounter --) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " tick-tick " + SharedCounter.sharedCounter);
        }
    }
}
