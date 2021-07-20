package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int n=0;
        while(true){
            System.out.print("Введите размер матрицы: ");
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
                if(n>0){
                    break;
                }
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }
        int sum=0;
        int [][]ms=new int[n][n];
        for(int i=0;i< ms.length;i++){
            for(int j=0;j< ms.length;j++){
                ms[i][j]= random.nextInt(100);
                System.out.print(ms[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i< ms.length;i++){
           for(int j=0;j<ms.length-i-1;j++){
               if(ms[i][j]%2==0) {
                   sum += ms[i][j];
               }
            }
        }
        System.out.println("sum = "+sum);
    }
}
