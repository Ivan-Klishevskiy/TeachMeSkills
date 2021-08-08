package Unit8.Task2;

import java.util.Random;

public class Shepard implements IStart{
    @Override
    public Boolean checkSystems() {
        Random random=new Random();
        return (random.nextBoolean());
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
