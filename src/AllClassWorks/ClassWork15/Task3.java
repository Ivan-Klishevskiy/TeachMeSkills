package AllClassWorks.ClassWork15;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> txt= new ArrayList<>();
        Collections.addAll(txt,"Bobo","Dodo","Java","Jona","Jira","Ggfd");
        boolean b = txt
                .stream()
                .filter(s -> s.contains("B"))
                .map(s -> s.toUpperCase(Locale.ROOT))
                .anyMatch(s -> s.equalsIgnoreCase("Java"));
        System.out.println(b);
    }
}
