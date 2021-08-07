package AllClassWorks.classwork3;

import java.util.Random;
import java.util.Scanner;

public class cl3p1 {
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
        int count=0;
        for(int i=0,j=0;i<a.length;i++){
            a[i]= random.nextInt(10);
            System.out.print(a[i] + " ");
            if(i%2==0){
                count++;
            }
        }
        System.out.println();
        int []b=new int[count];
        for(int i=0,j=0;i<a.length;i++){
            if(i%2==0){
                b[j]=a[i];
                System.out.print(b[j]+" ");
                j++;
            }
        }
        System.out.println();
    }
}
