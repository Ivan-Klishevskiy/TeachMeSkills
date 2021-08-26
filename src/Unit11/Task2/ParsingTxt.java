package Unit11.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTxt {
    public static String parsingFunc(String allTxt) {
        StringBuilder finalTxt = new StringBuilder();


        String[]arrTxt =allTxt.replace(". ", ".\n").replace("! ", "!\n").
                replace("? ", "?\n").split("\n");
        for (String txt : arrTxt) {
            //если полидром и/или слов от 3 до 5 то записываем в файл
            if (TextFormatter.havePalindrome(txt)||TextFormatter.numberOfWords(txt)>=3&&TextFormatter.numberOfWords(txt)<=5) {
                finalTxt.append(txt).append("\n");
            }
        }

        return finalTxt.toString();
    }
}
