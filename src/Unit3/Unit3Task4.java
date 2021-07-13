package Unit3;

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        Random random=new Random();
        int ms[]=new int[20];
        for(int i=0;i<20;i++){
            ms[i]= random.nextInt(20);
        }
        for(int i=0;i<20;i++){
            System.out.printf(ms[i]+" ");
        }
        for(int i=0;i<20;i++){
            if(i%2!=0){
                ms[i]=0;
            }
        }
        System.out.println();
        for(int i=0;i<20;i++){
            System.out.printf(ms[i]+" ");
        }
    }
}
