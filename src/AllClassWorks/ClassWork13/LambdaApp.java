package AllClassWorks.ClassWork13;

public class LambdaApp {
    public static void main(String[] args) {
        Operational op=(x,y)->x+y;
        op.calculate(2,5);
    }
}
interface Operational {
    int calculate(int x,int y);
}
