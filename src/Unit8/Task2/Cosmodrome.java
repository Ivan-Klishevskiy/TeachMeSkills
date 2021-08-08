package Unit8.Task2;

public class Cosmodrome {
    public void launch(IStart start) {
        if(start.checkSystems()){
            start.startEngines();
            for (int i = 10; i >= 0; i--) {
                System.out.println("Осталось: " + ((i > 4)? i + " секунд": (i > 1)? i + " секунды" : (i == 1)? i + " секунда" : "менее секунды"));
            }
            start.start();
        }else{
            System.out.println("Предстартовая проверка провалена");
        }
    }

}
