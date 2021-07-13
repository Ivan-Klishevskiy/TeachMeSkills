package Unit2;

public class Unit2Task1 {
    public static void main(String[] args) {
        double range=10;
        double sumRange=0;
        for(int i=0;i<7;i++){
            sumRange+=range;
            range*=1.1;
        }
        System.out.println(sumRange);
    }
}
