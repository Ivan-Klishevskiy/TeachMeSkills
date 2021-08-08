package Unit8.Task2;

import java.util.Random;

public class Falcon implements IStart{
    @Override
    public Boolean checkSystems() {
        Random random=new Random();
        return (random.nextInt(11) < 5);
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Falcon");
    }
}
