package Unit4;

import java.util.Scanner;

public class СrossZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int maxStep=9;    //макс. кол-во ходов в игре
        int sizeMtx=3;
        //иниц. и заполняем игр. поле и поле цифр ходов
        char [][]mtxGame=new char[sizeMtx][sizeMtx];
        int [][]mtxControl=new int[sizeMtx][sizeMtx];
        for(int i=0,k=1;i<sizeMtx;i++){
            for(int j=0;j<sizeMtx;j++,k++){
                mtxGame[i][j]=' ';
                mtxControl[i][j]=k;   //цифры от 1 до 9
            }
        }

        int flag=0;     //флаг победы одного из иг.
        int move=0;     //номер ячейки введенный игр.
        char player;
        int complite=0; //проверка записи в ячейку(0 - не записал, 1 - записал)


        for(int step=0;step<maxStep;step++) {        //цикл пока есть ходы

            //вывод игр. поля и поля контр. в консоль
            System.out.println("\n-------     -------");
            for (int i = 0; i < sizeMtx; i++) {
                for (int j = 0; j < sizeMtx; j++) {
                    System.out.print("|" + mtxGame[i][j]);
                }
                System.out.print("|     ");
                for (int j = 0; j < sizeMtx; j++) {
                    System.out.print("|" + mtxControl[i][j]);
                }
                System.out.print("|\n-------     -------\n");
            }

            if(step%2==0){
                System.out.print("Ход крестиков: ");
                player='X';
            }else{
                System.out.print("Ход ноликов: ");
                player='O';
            }
            do {
                complite=0;
                while (true) {
                    if (scanner.hasNextInt()) {
                        move = scanner.nextInt();
                        if (move > 0 && move < 10) {
                            break;
                        } else {
                            System.out.println("Введено неверное значение!");
                        }
                    } else {
                        System.out.println("Введено неверное значение!");
                        scanner.next();
                    }
                }

                switch (move) {
                    case 1 -> {
                        if (mtxGame[0][0] == ' ') {
                            mtxGame[0][0] = player;
                            complite = 1;
                        }
                    }
                    case 2 -> {
                        if (mtxGame[0][1] == ' ') {
                            mtxGame[0][1] = player;
                            complite = 1;
                        }
                    }
                    case 3 -> {
                        if (mtxGame[0][2] == ' ') {
                            mtxGame[0][2] = player;
                            complite = 1;
                        }
                    }
                    case 4 -> {
                        if (mtxGame[1][0] == ' ') {
                            mtxGame[1][0] = player;
                            complite = 1;
                        }
                    }
                    case 5 -> {
                        if (mtxGame[1][1] == ' ') {
                            mtxGame[1][1] = player;
                            complite = 1;
                        }
                    }
                    case 6 -> {
                        if (mtxGame[1][2] == ' ') {
                            mtxGame[1][2] = player;
                            complite = 1;
                        }
                    }
                    case 7 -> {
                        if (mtxGame[2][0] == ' ') {
                            mtxGame[2][0] = player;
                            complite = 1;
                        }
                    }
                    case 8 -> {
                        if (mtxGame[2][1] == ' ') {
                            mtxGame[2][1] = player;
                            complite = 1;
                        }
                    }
                    case 9 -> {
                        if (mtxGame[2][2] == ' ') {
                            mtxGame[2][2] = player;
                            complite = 1;
                        }
                    }
                }
                if(complite==0){
                    System.out.println("Клетка уже заполнена! Введите другое значение!");
                }
            }while (complite==0);

            //Проверка на победу
            if(step>2){
                for(int i=0;i<3;i++){
                    if ((mtxGame[i][0] == player && mtxGame[i][1] == player && mtxGame[i][2] == player) ||
                            (mtxGame[0][i] == player && mtxGame[1][i] == player &&
                                    mtxGame[2][i] == player)){
                        flag=1;
                        break;
                    }
                }
                if ((mtxGame[0][0] == player && mtxGame[1][1] == player && mtxGame[2][2] == player) ||
                        (mtxGame[2][0] == player && mtxGame[1][1] == player && mtxGame[0][2] == player)){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("Победили "+player);
                break;
            }
        }
        if(flag==0){
            for (int i = 0; i < sizeMtx; i++) {
                for (int j = 0; j < sizeMtx; j++) {
                    System.out.print("|" + mtxGame[i][j]);
                }
                System.out.println("|\n-------");
            }
            System.out.println("Ничья!");
        }
    }
}
