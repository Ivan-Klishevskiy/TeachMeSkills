package ShopUnit12;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        Shop shop = new Shop();
        int choice;

        do {
            System.out.print(
                    """
                            |***************MENU****************|
                            |_1)_Добавить товар_________________|
                            |_2)_Вывод всех товаров_____________|
                            |_3)_Редактировать товар____________|
                            |_0)_Выход из программы_____________|
                            *************************************
                            """
            );
            System.out.print("|->");

            choice = inputUserInt(0, 3);
            switch (choice) {
                case 1 -> addingFunction(shop);
                case 2 -> printFunction(shop);
                case 3 -> editProduct(shop);
            }

            System.out.println("Нажмите любую клавишу");
            try
            {
                System.in.read();
            }
            catch(Exception e)
            {}
            for (int i = 0; i < 10; i++) {
                System.out.println();
            }

        } while (choice != 0);
    }

    private void editProduct(Shop shop) {
        System.out.print("Id всех товаров: " + "\n" + shop.getAllId() + "\n" + "Введите Id товара: ");
        int id = inputUserInt(0, Integer.MAX_VALUE);

        System.out.println("Введите название товара: ");
        String name = inputUserString();

        System.out.print("Введите цену продукта: ");
        int price = inputUserInt(0, Integer.MAX_VALUE);
        shop.editProduct(new Product(id, name, price));
    }

    private void addingFunction(Shop shop) {
        System.out.print("Введите название нового продукта: ");
        String name = inputUserString();

        System.out.print("Введите цену нового продукта: ");
        int price = inputUserInt(0, Integer.MAX_VALUE);

        System.out.print("Введите id нового продукта: ");
        int id = inputUserInt(0, Integer.MAX_VALUE);

        shop.addProduct(new Product(id, name, price));
    }

    private String inputUserString() {
        scanner = new Scanner(System.in);
        String str = "";
        boolean correct;
        do {
            correct=true;
            if (scanner.hasNextLine()) {
                str = scanner.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < 'А' || str.charAt(i) > 'я') {
                        correct = false;
                        System.out.println("Ошибка, повторите ввод: ");
                        break;
                    }
                }
            } else {
                System.out.println("Ошибка, повторите ввод: ");
                scanner.next();
            }
        } while (!correct);
        return str;
    }


    private int inputUserInt(int min, int max) {
        int value = 0;
        boolean correct;
        do {
            correct=false;
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    correct=true;
                } else {
                    System.out.println("Ошибка, повторите ввод: ");
                    scanner.next();
                }
            }
        } while (!correct);
        return value;
    }

    private void printFunction(Shop shop) {
        System.out.println("""
                *********************Сортировка вывода*****************
                |_1)_По цене (возрастание)____________________________|
                |_2)_По цене (убывание)_______________________________|
                |_3)_По добавлению(сначала новые, потом более старые)_|
                *******************************************************
                |->
                """
        );

        switch (inputUserInt(1, 3)) {
            case 1 -> shop.sortByPriceAscending();
            case 2 -> shop.sortByPriceDecreasing();
            case 3 -> shop.sortByHistory();
        }

        System.out.println(
                """
                        **************************************
                        |_1)_Вывод в консоль_________________|
                        |_2)_Вывод в файл____________________|
                        **************************************
                        |->
                        """

        );

        if (inputUserInt(1, 2) == 1) {
            shop.printList();
        } else {
            //TODO вывод списка в файл
        }
    }
}
