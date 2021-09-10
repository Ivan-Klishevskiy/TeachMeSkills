package AllClassWorks.ClassWork16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("[a-z]\\w*\\.?");
        Matcher matcher=pattern.matcher("i.klishevskiy@mail.ru");
        while(matcher.find()){
            int start= matcher.start();
            int end = matcher.end();
            System.out.println("c "+start+" до "+end);
        }
    }
}
