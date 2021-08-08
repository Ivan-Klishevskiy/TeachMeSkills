package Unit9.Task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTxt {

    public static String parsingFunc(String allTxt)  {
        String finalTxt="";
        Matcher matcher = Pattern.compile("[^.!?]+[.!?]").matcher(allTxt);  //для разбития текста на предложения

        while(matcher.find()){
            String txt=matcher.group().trim();
            //если полидром и/или слов от 3 до 5 то записываем в файл
            if(TextFormater.palindrome(txt)){
                finalTxt+=txt;
            }
        }
        return  finalTxt;
    }


}
