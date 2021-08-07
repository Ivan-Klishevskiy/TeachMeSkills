package AllClassWorks.ClassWork1;

import java.util.Scanner;

public class p2cl1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a=scan.nextInt();
        int sumCh=0;
        int sumNe=0;
        for(int i=1;i<=a;i++){
            if(i%2==0){
                sumCh+=i;
            }
            else {
                sumNe+=i;
            }
        }
        System.out.println("Четн = "+sumCh);
        System.out.println("Нечетн = "+sumNe);
    }
}
