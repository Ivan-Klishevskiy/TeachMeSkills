package AllClassWorks.ClassWork12Part2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        Scanner scanner =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            set.add(scanner.nextInt());
        }
        set.forEach(System.out::println);
    }
}
