package Unit11.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtFormatter {

    public static String funcReader(String fileName) {
        StringBuilder allTxt = new StringBuilder("");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                allTxt.append(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return allTxt.toString();
    }

    public static String[] parsingFunc(String input) {
        return input.replace(". ", ".\n").replace("! ", "!\n").
                replace("? ", "?\n").split("\n");
    }

    public static void checkTxt(String[] txt, String blackWord) {
        String[] arrBlackWord = blackWord.split(" ");
        int badTxtCount=0;
        StringBuilder badTxt=new StringBuilder();
        for (String s : txt) {
            for (String s1 : arrBlackWord) {
                if(s.contains(s1)){
                    badTxtCount++;
                    badTxt.append(s).append("\n");
                    break;
                }
            }
        }
        if(badTxtCount>0){
            System.out.println("Кол-во предложений не прошедших проверку: "+badTxtCount);
            System.out.println(badTxt);
        }else{
            System.out.println("Текст прошёл проверку на цензуру");
        }
    }
}
