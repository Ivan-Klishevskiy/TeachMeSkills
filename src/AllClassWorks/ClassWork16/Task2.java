package AllClassWorks.ClassWork16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("(([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]){1,3}\\.){3}[01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]");
        Matcher matcher=pattern.matcher("127.0.0.1");
        while(matcher.find()){
            int start= matcher.start();
            int end = matcher.end();
            System.out.println("c "+start+" до "+end);
        }
    }
}
