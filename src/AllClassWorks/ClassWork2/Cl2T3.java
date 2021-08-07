package AllClassWorks.classwork2;

import java.util.Random;

public class Cl2T3 {
    public static void main(String[] args) {
        Random random=new Random();
        int []ms=new int[10];
        for(int i=0;i< ms.length;i++){
            ms[i]= random.nextInt((100-10)+1)+10;
            System.out.printf(ms[i]+" ");
        }
        int curNumber=0;
        int curCount=0;
        int maxCount=0;
        int maxNumber=0;
        System.out.println();
        for(int i=0;i< ms.length-1;i++){
            curNumber=ms[i];
            curCount=0;
            for(int j=i;j<ms.length;j++){
                if(curNumber==ms[j])
                {
                    curCount++;
                }
            }
            if(curCount>maxCount){
                maxCount=curCount;
                maxNumber=curNumber;
            }
        }
        System.out.println(maxNumber);
    }
}
