package AllClassWorks.classwork3;

import java.util.Random;
import java.util.Scanner;

public class cl3p6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int n=0;
        while(true){
            if(scanner.hasNextInt()){
                n= scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }
        int []a=new int[n];
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        int indexMax=0;
        int indexMin=0;
        for(int i=0;i<a.length;i++){
            a[i]= random.nextInt(10);
            System.out.print(a[i]+" ");
            if(a[i]>maxValue){
                maxValue=a[i];
                indexMax=i;
            }
            if(a[i]<minValue){
                minValue=a[i];
                indexMin=i;
            }
        }
        int temp=a[indexMax];
        a[indexMax]=a[indexMin];
        a[indexMin]=temp;
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
