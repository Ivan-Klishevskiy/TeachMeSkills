package AllClassWorks.ClassWork9.Task0;

import java.util.Locale;

public class Start {
    public static void main(String[] args) {
        String str=" Hello World ";
        String str2=" Hello WORlD ";
        System.out.println(str.endsWith("World "));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.concat(str2));
        System.out.println(String.valueOf(2));
        System.out.println(String.join("|",str,str2));
        System.out.println(str.compareTo(str2));
        System.out.println(str.charAt(2));
        char []ms=new char[5];
        str.getChars(1,5,ms,1);
        System.out.println(ms);
        System.out.println(str.equals(str2));
        System.out.println(str.indexOf("World"));
        System.out.println(str2.lastIndexOf("log"));
        System.out.println(str.startsWith("H"));

        System.out.println(str.replace("H","|"));
        System.out.println(str.trim());
        System.out.println(str2.substring(1,5));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str2.toUpperCase(Locale.ROOT));
    }
}
