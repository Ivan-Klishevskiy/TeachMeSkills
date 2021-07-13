package Unit3;

import java.util.Random;

public class Unit3Task15 {
    public static void main(String[] args) {
        Random random=new Random();
        int n=11;
        int ms[]=new int[n];
        for(int i=0;i<n;i++){
            ms[i]= random.nextInt(10);
            System.out.printf(ms[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(i<n/2) {
                ms[i] = ms[i + 1];
            }else{
                ms[i]=0;
            }
            System.out.printf(ms[i]+" ");
        }
    }
}
