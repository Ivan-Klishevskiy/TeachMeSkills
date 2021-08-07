package AllClassWorks.classwork3;

import java.util.Random;
import java.util.Scanner;

public class cl3p7 {
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
        int forControl=0;
        do{
            while(true){
                System.out.println("\n1-впр, 2-влв");
                if(scanner.hasNextInt()){
                    forControl= scanner.nextInt();
                    break;
                }
                else{
                    System.out.println("Error");
                    scanner.next();
                }
            }
            if(forControl==0){
                break;
            }
            switch (forControl){
                case 1:
                {
                    System.out.println();
                    int temp=0;
                    for(int i= a.length-1;i>=1;i--){
                        a[i]=a[i-1];
                    }
                    a[0]=0;
                    System.out.println();
                    for(int i=0;i<a.length;i++){
                        System.out.print(a[i]+" ");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println();
                    int temp=0;
                    for(int i=0;i<a.length-1;i++){
                        a[i]=a[i+1];
                    }
                    a[a.length-1]=0;
                    System.out.println();
                    for(int i=0;i<a.length;i++){
                        System.out.print(a[i]+" ");
                    }
                    break;
                }
            }

        }while(true);
    }
}
