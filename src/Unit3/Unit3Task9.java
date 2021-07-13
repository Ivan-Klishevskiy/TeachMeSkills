package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int sumRight=0;
        int sumLeft=0;
        do{
            System.out.printf("Введите размер массива: ");
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
            }
            else{
                System.out.println("Error!");
                scanner.next();
            }
        }while(n<=0);
        int ms[]=new int[n];
        for(int i=0;i<n;i++){
            ms[i]= random.nextInt(15);
            System.out.printf(ms[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n/2;i++){
            sumLeft+=ms[i];
            sumRight+=ms[n-i-1];
        }
        if(sumLeft>sumRight){
            System.out.println("Левая половина массива больше");
        }else if(sumLeft<sumRight){
            System.out.println("Правая половина массива больше");
        }else{
            System.out.println("Cуммы модулей равны");
        }
    }
}
