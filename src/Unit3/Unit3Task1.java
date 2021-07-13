package Unit3;

public class Unit3Task1 {
    public static void main(String[] args) {
        int ms[]=new int[10];
        int index=0;

        for(int i=2;i<=20;i++){
            if(i%2==0){
                ms[index]=i;
                index++;
            }
        }

        for(int i=0;i<10;i++){
            System.out.printf(ms[i]+" ");
        }

        for(int i=0;i<10;i++){
            System.out.println(ms[i]);
        }
    }
}
