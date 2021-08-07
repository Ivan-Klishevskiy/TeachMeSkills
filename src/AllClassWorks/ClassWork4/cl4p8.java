package AllClassWorks.classwork4;

import java.util.Random;
import java.util.Scanner;

public class cl4p8 {
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
        int [][]matrx=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrx[i][j]= random.nextInt(111)-10;
                System.out.print(matrx[i][j]+" | ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrx[i][j]<0){
                    System.out.println("["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}
