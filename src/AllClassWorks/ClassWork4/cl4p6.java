package AllClassWorks.classwork4;

import java.util.Random;
import java.util.Scanner;

public class cl4p6 {
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
                matrx[i][j]= random.nextInt((100-10)+1)+10;
                System.out.print(matrx[i][j]+" | ");
            }
            System.out.println();
        }
        int maxSum=0;
        int sum=0;
        int index=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<k;j++){
                sum+=matrx[i][j];
            }
            if(maxSum<sum){
                maxSum=sum;
                index=i;
            }
        }
        System.out.println(index+" "+maxSum);

    }
}
