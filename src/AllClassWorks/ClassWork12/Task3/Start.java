package AllClassWorks.ClassWork12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<HeavyBox> list=new ArrayList<>();
        list.add(new HeavyBox("1"));
        list.add(new HeavyBox("2"));
        list.add(new HeavyBox("3"));
        list.add(new HeavyBox("4"));
        list.add(new HeavyBox("5"));

        for (HeavyBox heavyBox : list) {
            System.out.println(heavyBox);
        }

    }
}
