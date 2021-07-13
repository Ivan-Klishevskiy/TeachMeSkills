package Unit3;

public class Unit3Task2 {
    public static void main(String[] args) {
        int ms[]=new int[50];
        int index=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0){
                ms[index]=i;
                index++;
            }
        }
        for(int i=0;i<50;i++){
            System.out.printf(ms[i]+" ");
        }
        System.out.println();
        for(int i=49;i>=0;i--){
            System.out.printf(ms[i]+" ");
        }
    }
}
