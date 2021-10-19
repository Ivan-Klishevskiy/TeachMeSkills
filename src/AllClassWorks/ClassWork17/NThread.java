package AllClassWorks.ClassWork17;

public class NThread implements Runnable{
    private Res res;

    public NThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

                res.mul();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
