package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task19 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int first=0;
        int second=0;
        int size=0;
        do{
            if(scanner.hasNextInt()){
                size=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }while (true);

        int ms[]=new int[size];

        for(int i=0;i<size;i++){
            ms[i]=random.nextInt(10);
            System.out.printf(ms[i]+" ");
        }
        if(size>2) {
            for (int i = 0; i < size; i++) {
                if (ms[i] >= first) {
                    first = ms[i];
                    continue;
                }
                if(ms[i]>second){
                    second=ms[i];
                }
            }
            System.out.println("\n" + second);
        }
    }
}
