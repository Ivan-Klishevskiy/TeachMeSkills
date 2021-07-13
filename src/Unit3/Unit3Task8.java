package Unit3;

import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args) {
        Random random=new Random();
        int a[]=new int[10];
        int b[]=new int[10];
        double c[]=new double[10];
        int count=0;
        for(int i=0;i<10;i++){
            a[i]= random.nextInt(9);
            b[i]= random.nextInt(9);
            if(a[i]!=0&&b[i]!=0){
                c[i]=((double) a[i])/((double) b[i]);
            }
            else {
                c[i]=0;
            }
        }
        for(int i=0;i<10;i++){
            System.out.printf(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.printf(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.printf(c[i]+" ");
            if(c[i]%1==0){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
