package Unit3;

import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        Random random=new Random();
        int a[]=new int[5];
        int b[]=new int[5];
        int sumA=0;
        int sumB=0;
        for(int i=0;i<5;i++){
            a[i]= random.nextInt(15);
            sumA+=a[i];
            b[i]= random.nextInt(15);
            sumB+=b[i];
        }
        for(int i=0;i<5;i++){
            System.out.printf(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.printf(b[i]+" ");
        }
        System.out.println();
        if(sumA/5>sumB/5){
            System.out.println("Среднее арифметическое для массива a больше чем для массива b");
        }else if(sumA/5<sumB/5){
            System.out.println("Среднее арифметическое для массива b больше чем для массива a");
        }else{
            System.out.println("Среднее арифметическое для массивов a и b равны");
        }
    }
}
