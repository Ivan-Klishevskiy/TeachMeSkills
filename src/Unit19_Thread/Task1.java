package Unit19_Thread;


class Hotel {
    private static int place = 2;

    public  void checkRoom() {
        while (place < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Заселился "+Thread.currentThread().getName());
        liveInRoom();
    }

    public void liveInRoom() {
        place--;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        place++;
        System.out.println("Выселился"+Thread.currentThread().getName());
        notifyAll();
    }
}

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Hotel hotel = new Hotel();
        Runnable r = () -> {
            hotel.checkRoom();
        };
        for (int i = 0; i < 10; i++) {
            System.out.println("Создался поток " + i);
            Thread myThread = new Thread(r,String.valueOf(i));
            myThread.start();
            Thread.sleep(1000);
        }
    }
}
