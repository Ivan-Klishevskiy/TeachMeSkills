public class Unit1Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 10;

        if(a*b*c>0 && a+b>c && a+c>b && c+b>a)
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");
    }
}
