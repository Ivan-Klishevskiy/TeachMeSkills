package AllClassWorks.classwork4;

import java.util.Random;
import java.util.Scanner;

public class cl4p5 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int k=0;
        while(true){
            System.out.print("Введите n: ");
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }
        while(true){
            System.out.print("Введите k: ");
            if(scanner.hasNextInt()){
                k=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }
        int [][]matrx=new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                while(true){
                    if(scanner.hasNextInt()){
                        matrx[i][j]=scanner.nextInt();
                        break;
                    }
                    else{
                        System.out.println("Error");
                        scanner.next();
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                System.out.print(matrx[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                sum+=matrx[j][i];
            }
            System.out.print(sum+" ");
            sum=0;
        }
    }
}
