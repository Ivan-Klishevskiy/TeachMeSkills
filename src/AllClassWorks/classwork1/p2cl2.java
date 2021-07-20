package AllClassWorks.classwork1;

import java.util.Scanner;

public class p2cl2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a=scan.nextInt();
        long f=1l;
        for(int i=1;i<=a;i++){
            f*=i;
        }
        System.out.println(f);
    }
}
