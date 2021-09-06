package AllClassWorks.ClassWork13Part2;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        Predicate<String> checkJorN= i->i.startsWith("J")||i.startsWith("N");
        Predicate<String> checkLastLetters= i-> i.charAt(i.length()-1)=='A';
        System.out.println(checkJorN.and(checkLastLetters).test("JorA"));
    }
}
