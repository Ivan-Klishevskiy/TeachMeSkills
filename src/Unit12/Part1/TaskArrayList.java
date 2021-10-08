package Unit12.Part1;

import java.util.ArrayList;
import java.util.List;

public class TaskArrayList {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer>buffer=new ArrayList<>();
        buffer.add(5);
        buffer.add(6);
        buffer.add(7);
        buffer.add(8);
        list.addAll(buffer);
        System.out.println(buffer.containsAll(list));
        for (Integer integer : list) {
            System.out.println(integer);
        }
        list.clear();
        System.out.println(list);

    }
}
