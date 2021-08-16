package Unit9;

public class Task2 {
    public static void func(String str){
        if(str.length()>4) {
            System.out.println(str.replace(str.charAt(3), str.charAt(0)));
        }
    }
}
