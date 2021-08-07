package AllClassWorks.ClassWork9.Task1;

import java.util.Locale;

public class Test {
    public void func(String str){
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(7,11));

    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        Test test=new Test();
        test.func(str);
    }
}
