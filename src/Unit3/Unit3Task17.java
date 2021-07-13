package Unit3;

import java.util.Random;

public class Unit3Task17 {
    public static void main(String[] args) {
        Random random=new Random();
        int flag=0;
        int n=5;
        int cur=0;
        int ms[]=new int[n];
        for(int i=0;i<n;i++){
            ms[i]=random.nextInt(10);
            System.out.printf(ms[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(ms[i]==ms[j]){
                    flag=1;
                }
            }
        }
        System.out.println();
        if(flag==1){
            System.out.println("Не различны");
        }
        else {
            System.out.println("Различны");
        }
    }
}
