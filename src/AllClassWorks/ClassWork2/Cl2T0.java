package AllClassWorks.classwork2;

import java.util.Random;
import java.util.Scanner;

public class Cl2T0 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int n=0;
        do{
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }while(true);
        int ms[]=new int[n];
        for(int i=0;i<n;i++){
            ms[i]=random.nextInt(10);
            if(ms[i]%2==0){
                count++;
            }
            System.out.printf(ms[i]+" ");
        }
        System.out.println();
        int ms2[]=new int[count];
        for(int i=0,j=0;i<n;i++){
            if(ms[i]%2==0){
                ms2[j]=ms[i];
                System.out.printf(ms2[j]+" ");
                j++;
            }
        }
    }
}
