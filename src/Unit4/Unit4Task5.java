package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task5 {
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
        int [][]ms=new int[n][n];
        for(int i=0;i< ms.length;i++){
            for(int j=0;j< ms.length;j++){
                ms[i][j]= random.nextInt(10);
                System.out.print(ms[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int temp=0;
        for(int i=0;i< ms.length;i++){
            for(int j=i+1;j< ms.length;j++){
                    temp=ms[i][j];
                    ms[i][j]=ms[j][i];
                    ms[j][i]=temp;
                }
        }
        for(int i=0;i< ms.length;i++){
            for(int j=0;j< ms.length;j++){
                System.out.print(ms[i][j]+" ");
            }
            System.out.println();
        }
    }
}
