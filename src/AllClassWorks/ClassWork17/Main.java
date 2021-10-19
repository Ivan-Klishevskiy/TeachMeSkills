package AllClassWorks.ClassWork17;

public class Main {
    public static void main(String[] args) {
        Res res = new Res(1);
        Res next =new Res(1);
        NThread nThread = new NThread(res);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(nThread);
            thread.start();
        }

        NThread tThread = new NThread(next);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(tThread);
            thread.start();
        }
    }
}
