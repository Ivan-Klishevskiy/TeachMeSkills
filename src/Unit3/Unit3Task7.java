package Unit3;

import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        Random random=new Random();
        int ms[]=new int[12];
        int index=0;
        int maxValue=0;
        for(int i=0;i<12;i++){
            ms[i]= random.nextInt(15);
            if(i==0){
                maxValue=ms[i];
            }
            if(maxValue<=ms[i]){
                maxValue=ms[i];
                index=i;
            }
            System.out.printf(ms[i]+" ");
        }
        System.out.println();
        System.out.println("Максимальное значение "+maxValue+" под индексом "+index);
    }
}
