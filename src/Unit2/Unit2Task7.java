package Unit2;

public class Unit2Task7 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        while (count++<=99){
            if(count%2!=0){
                sum+=count;
            }
        }
        System.out.println(sum);
    }
}
