package ShopUnit12;

import java.util.Scanner;

public class IOService {
    private Scanner sc;

    public int getInt(int min, int max) {
        sc = new Scanner(System.in);
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Wrong input. Must be int.");
                sc.next();
            }
            int number = sc.nextInt();
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Wrong input. Must be more than " + min + " and less than " + max);
            }
        }
    }

    public String getString() {
        sc = new Scanner(System.in);
        while (true) {
            while (!sc.hasNextLine()) {
                sc.next();
            }
            String str = sc.nextLine();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 'A' || str.charAt(i) > 'z') {
                    flag = false;
                    System.out.println("Wrong input.");
                    break;
                }
            }
            if (flag) {
                return str;
            }
        }
    }
}
