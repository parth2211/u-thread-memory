import threadcreator.SharedCounter;
import threadcreator.ThreadCounter1;
import threadcreator.ThreadCounter2;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Thread counter1 = new Thread(new ThreadCounter1( 10));
        Thread counter2 = new Thread(new ThreadCounter2( 15));

        counter2.start();
        counter1.start();
    }
}