package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int count=0;
        do{
            System.out.printf("Введите число больше 3: ");
            if(scanner.hasNextInt()){
                n= scanner.nextInt();
                if(n<3){
                    System.out.println("Введено число меньше 3!");
                }
            }
            else{
                System.out.println("Введено недопустимое значение!");
                scanner.next();
            }
        }while(n<3);

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(n);
            System.out.printf(a[i]+" ");
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println();

        if(count!=0) {
            int b[] = new int[count];
            for(int i=0,j=0;i<n;i++){
                if(a[i]%2==0){
                    b[j]=a[i];
                    System.out.printf(b[j]+" ");
                    j++;
                }
            }
        }

    }
}
