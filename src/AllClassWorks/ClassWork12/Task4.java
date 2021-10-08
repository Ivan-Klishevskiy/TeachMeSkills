package AllClassWorks.ClassWork12;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        int number;
        for(int i=0;i<5;i++){
            number=scanner.nextInt();
            hashMap.put(number,number);
        }

        System.out.println(hashMap);

    }
}
