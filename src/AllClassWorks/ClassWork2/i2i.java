package AllClassWorks.classwork2;

import java.util.Random;

public class i2i {
    public static void main(String[] args) {
        Random random=new Random();
        int[] ms=new int[10];
        int max=0;
        int min=0;
        for(int i=0;i<ms.length;i++){
            ms[i]=random.nextInt(100);
            System.out.printf(ms[i]+" ");
            if(i==0){
                max=ms[i];
                min=ms[i];
                continue;
            }
            if(ms[i]>max){
                max=ms[i];
            }
            if(ms[i]<min){
                min=ms[i];
            }
        }
        System.out.println("\nmin "+min);
        System.out.println("max "+max);
    }
}
