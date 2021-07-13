package Unit3;

import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        Random random=new Random();
        int ms[]=new int[4];
        int flag=0;
        for(int i=0;i<4;i++){
            ms[i]= random.nextInt(10);
            System.out.printf(ms[i]+" ");
        }
        System.out.println();
        for(int i=0;i<3;i++){
            if(ms[i]>=ms[i+1]){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("массив НЕ является строго возрастающей последовательностью");
        }else {
            System.out.println("массив является строго возрастающей последовательностью");
        }
    }
}
