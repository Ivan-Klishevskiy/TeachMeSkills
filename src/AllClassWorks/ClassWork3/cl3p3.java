package AllClassWorks.classwork3;

import java.util.Random;
import java.util.Scanner;

public class cl3p3 {
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
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            a[i]= random.nextInt(10);
            System.out.print(a[i]+" ");
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("\n"+min);
    }
}
