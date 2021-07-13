package Unit1;

public class Unit1Task1 {
    public static void main(String[] args) {
        int number=-100000;
        String str=String.valueOf(number);
        if(number>=0)
            System.out.println("Это положительное "+str.length()+"-значное число");
        else
            System.out.println("Это отрицательное "+(str.length()-1)+"-значное число");
    }
}
