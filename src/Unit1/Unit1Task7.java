public class Unit1Task7 {
    public static void main(String[] args) {
        int count =504;
        int lust = count%10;
        System.out.print(count+" программист");
        if(lust>1&&lust<5||lust==0)
            System.out.println("a");
        if(lust>=5)
            System.out.println("ов");
    }
}
