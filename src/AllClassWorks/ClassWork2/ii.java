package AllClassWorks.classwork2;

import java.util.Random;
import java.util.Scanner;

public class ii {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n;
        do{
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
                break;
            }
            else{
                scanner.next();
                System.out.println("NAN");
            }

        }while (true);
        int ms[]=new int[n];
        for(int i=0;i<n;i++){
            ms[i]=random.nextInt(50);
            System.out.printf(ms[i]+" ");
        }
    }
}
