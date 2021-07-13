package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task11 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int mul=1;
        do{
            System.out.printf("Введите размер массива: ");
           if(scanner.hasNextInt()){
               n=scanner.nextInt();
           }
           else{
               System.out.println("Введено недопустимое значение!");
               scanner.next();
           }
        }while(n<=0);
        int ms[]=new int[n];

        for(int i=0;i<n;i++){
            ms[i]= random.nextInt(10);
            System.out.printf(ms[i]+" ");
            if(ms[i]%3==0&&ms[i]!=0&&ms[i]!=1){
                mul*=ms[i];
            }
        }
        System.out.println("\n"+mul);
    }
}
