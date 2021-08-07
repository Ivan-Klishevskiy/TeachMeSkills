package AllClassWorks.classwork4;

import java.util.Random;
import java.util.Scanner;

public class cl4p2 {
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
        int [][]matrx=new int[k][n];
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                matrx[i][j]= random.nextInt(100);
                System.out.print(matrx[i][j]+" ");
            }
            System.out.println();
        }
        int []array=new int[k*n];
        for(int i=0,y=0;i<k;i++){
            for(int j=0;j<n;j++){
                array[y]=matrx[i][j];
                y++;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
