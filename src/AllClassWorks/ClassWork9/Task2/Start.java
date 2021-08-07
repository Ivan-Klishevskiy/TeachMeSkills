package AllClassWorks.ClassWork9.Task2;

public class Start {
    public static void main(String[] args) {
        int a=3;
        int b=56;
        StringBuilder strB=new StringBuilder();
        strB.append(a).append("+").append(b).append("=").append(a+b);
        System.out.println(strB);
        strB=new StringBuilder();
        strB.append(a).append("-").append(b).append("=").append(a-b);
        System.out.println(strB);
        strB=new StringBuilder();
        strB.append(a).append("*").append(b).append("=").append(a*b);
        System.out.println(strB);
        strB.deleteCharAt(4);
        strB.insert(4,"равно");
        System.out.println(strB);
        strB=new StringBuilder();
        strB.append(a).append("*").append(b).append("=").append(a*b);
        strB.replace(4,9,"равно"+a*b);
        System.out.println(strB);
    }
}
