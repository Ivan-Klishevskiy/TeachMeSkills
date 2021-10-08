package AllClassWorks.ClassWork12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String>people=new ArrayList<>();

        people.add("Tom");
        people.add("aaffs");
        people.add("gsdgfd");
        people.add("Ooooo");
        people.add(1,"Bob");

        System.out.println(people.get(1));
        people.set(1,"Robert");
        System.out.println("ArrayList size "+people.size());
        for (String person : people) {
            System.out.println(person);
        }
        if(people.contains("Tom")){
            System.out.println("its Tom");
        }

        people.remove("Robert");
        people.remove(0);

        Object[]peopleArray= people.toArray();
        for (Object o : peopleArray) {
            System.out.println(o);
        }
    }
}
