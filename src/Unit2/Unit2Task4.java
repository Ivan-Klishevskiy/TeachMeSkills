package Unit2;

import java.util.Scanner;

public class Unit2Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int sum=0;
        for(int count=0;count<B;count++){
            sum+=A;
        }

        System.out.println(sum);
    }
}
