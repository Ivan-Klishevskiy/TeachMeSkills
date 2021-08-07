package AllClassWorks.ClassWork9.Task6;

import java.util.Locale;

public class Start {
    public String firstCharUpper(String str){
        String str2="";
        str2=str2+str.substring(0,1).toUpperCase(Locale.ROOT);
        str=str.substring(1);
        str2=str2.concat(str);
        return str2;
    }

    public static void main(String[] args) {
        Start start=new Start();
        String str="hello world Java !";
        System.out.println(start.firstCharUpper(str));
    }
}
