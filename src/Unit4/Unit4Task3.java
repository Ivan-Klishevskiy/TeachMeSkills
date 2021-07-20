package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
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
        long sideD=1;
        long mainD=1;
        for(int i=0;i< ms.length;i++){
            sideD*=ms[ms.length-i-1][i];
            mainD*=ms[i][i];
        }
        System.out.println("sideD = "+sideD+"\nmainD = "+mainD);
        if(mainD>sideD){
            System.out.println("\nГлавная д. больше");
        }else if(mainD<sideD){
            System.out.println("\nПобочная д. больше");
        }else{
            System.out.println("\nДиагонали равны");
        }
    }
}
