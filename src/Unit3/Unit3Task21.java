package Unit3;

import java.util.Random;

public class Unit3Task21 {
    public static void main(String[] args) {
        Random random= new Random();
        int size=10;
        int max=0;
        int ms[]=new int[size];
        int index=0;
        for(int i=0;i<size;i++){
            ms[i]= random.nextInt(20);
            System.out.printf(ms[i]+" ");
            if(i==0){
                max=ms[i];
            }
            if(ms[i]>max){
                max=ms[i];
                index=i;
            }
        }
        ms[index]=ms[0];
        ms[0]=max;
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.printf(ms[i]+" ");
        }
    }
}
