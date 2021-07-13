package Unit3;

import java.util.Random;

public class Unit3Task20 {
    public static void main(String[] args) {
        Random random= new Random();
        int size=10;
        int min=0;
        int ms[]=new int[size];
        for(int i=0;i<size;i++){
            ms[i]= random.nextInt(20);
            System.out.printf(ms[i]+" ");
            if(i==0){
                min=ms[i];
            }
            if(ms[i]<min){
                min=ms[i];
            }
        }
        System.out.println("\n"+min);
    }
}
