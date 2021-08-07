package AllClassWorks.classwork3;

import java.util.Random;
import java.util.Scanner;

public class cl3p8 {
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
        for(int i=0;i<a.length;i++){
            temp=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    temp++;
                }
            }
            if(temp==1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
