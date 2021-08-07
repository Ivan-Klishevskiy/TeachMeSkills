package AllClassWorks.ClassWork9.Task5;

import java.util.Locale;

public class Start {
    public String dash(String str){
        str=str.toUpperCase(Locale.ROOT).replace(" ","-");
        return str;
    }

    public static void main(String[] args) {
        Start start=new Start();
        String str="Hello world Java !";
        System.out.println(start.dash(str));
    }
}
