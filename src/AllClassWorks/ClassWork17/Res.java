package AllClassWorks.ClassWork17;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Res {
    private static AtomicLong num;

    public Res(int i) {
        num=new AtomicLong(i);
    }

    public synchronized void mul(){
        long i =num.get();
        i*=2;
        num.set(i);
        System.out.println(getNum());
    }

    public synchronized AtomicLong getNum() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num;
    }
}
