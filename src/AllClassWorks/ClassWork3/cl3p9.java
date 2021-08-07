package AllClassWorks.classwork3;

import java.util.Random;
import java.util.Scanner;

public class cl3p9 {
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
        for(int i=0;i<a.length;i++){
            a[i]= random.nextInt(10);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<a.length/2;i++){
            temp=a[a.length-1];
            a[a.length-1]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
