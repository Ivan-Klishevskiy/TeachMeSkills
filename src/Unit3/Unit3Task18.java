package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task18 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int enterNumber=0;
        int count=0;
        int size=10;
        int ms[]=new int[size];
        do{
            System.out.printf("Введите число: ");
            if(scanner.hasNextInt()){
                enterNumber=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Введено не число");
                scanner.next();
            }
        }while(true) ;                               //Цикл пока не ввели прав значение
        for(int i=0;i<size;i++){
            ms[i]=random.nextInt(10);
            System.out.printf(ms[i]+" ");
            if(ms[i]==enterNumber){
                count++;
            }
        }
        System.out.println("\n"+count);
    }
}
