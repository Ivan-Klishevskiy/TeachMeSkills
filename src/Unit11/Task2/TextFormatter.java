package Unit11.Task2;

import Unit9.Task4.TextFormater;

public class TextFormatter {
    public static int numberOfWords(String str) {
        return str.split(" +").length;
    }

    public static boolean havePalindrome(String str){
        String[] words = str.split(" +");
        for(String i: words){
            StringBuilder rWord=new StringBuilder(i).reverse();
            if(i.equals(rWord.toString())){
                return true;
            }
        }
        return false;
    }
}
