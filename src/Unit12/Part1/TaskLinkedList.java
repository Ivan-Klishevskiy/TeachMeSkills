package Unit12.Part1;

import java.util.LinkedList;
import java.util.List;

public class TaskLinkedList {
    public static void main(String[] args) {
        List<String>list=new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("5");
        list.add("4");
        System.out.println(list.size());
        System.out.println("lastIndexOf "+list.lastIndexOf("5"));
        list.add(2,"Add1");
        System.out.println(list);
        list.add(2,"Add2");
        System.out.println(list);
    }
}
