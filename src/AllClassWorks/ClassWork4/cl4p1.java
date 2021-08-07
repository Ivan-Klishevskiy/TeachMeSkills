package AllClassWorks.classwork4;

import java.util.Random;
import java.util.Scanner;

public class cl4p1 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int k=0;
        while(true){
            System.out.print("Введите n: ");
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }
        while(true){
            System.out.print("Введите k: ");
            if(scanner.hasNextInt()){
                k=scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error");
                scanner.next();
            }
        }
        int [][]ms=new int[k][n];
        int count=0;
        String st;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                ms[i][j]= random.nextInt(999);
                System.out.print(ms[i][j]+ " ");
                st=String.valueOf(ms[i][j]);
                if(st.length()==2){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
