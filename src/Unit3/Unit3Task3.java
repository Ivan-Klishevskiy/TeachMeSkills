package Unit3;

import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        Random random=new Random();
        int count=0;
        int ms[]=new int[15];
        for(int i=0;i<15;i++){
            ms[i]=random.nextInt(99);
        }
        for(int i=0;i<15;i++){
            System.out.printf( ms[i]+" ");
            if(ms[i]%2==0){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);



    }
}
