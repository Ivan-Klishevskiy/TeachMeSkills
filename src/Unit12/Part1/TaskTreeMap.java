package Unit12.Part1;

import java.util.HashMap;
import java.util.Map;

public class TaskTreeMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(5,"Five");
        map.put(4,"Four");
        map.put(2,"Two");
        map.put(1,"One");
        map.put(1,"First");
        System.out.println(map);
        map.remove(4);
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(4));
    }
}
