package Unit3;

import java.util.Random;

public class Unit3Task14 {
    public static void main(String[] args) {
        Random random=new Random();
        int ms[]=new int[10];
        int min=0;
        for(int i=0;i<10;i++){
            ms[i]= random.nextInt(10);
            System.out.printf(ms[i]+" ");
        }
        min=ms[0];
        for(int i=1;i<10;i++){
            if(i%2!=0&&min>ms[i]){
                min=ms[i];
            }
        }
        System.out.println("\n"+min);
    }
}
