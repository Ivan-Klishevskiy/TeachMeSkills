package Unit9.Task4;

public class TextFormater {
    private static int numberOfWords(String str) {
        return str.split(" +").length;
    }

    public static boolean palindrome(String str){
        if(TextFormater.numberOfWords(str)>=3&&TextFormater.numberOfWords(str)<=5){
            return true;
        }
        String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for(String i: words){
            StringBuilder rWord=new StringBuilder(i).reverse();
            if(i.equals(rWord.toString())){
                return true;
            }
        }
        return false;
    }

}
