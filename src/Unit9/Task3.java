package Unit9;

import java.io.*;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws IOException {
        String pathIn = "E:\\TMS_course\\src\\Unit9\\ForInputTask3";
        String pathOut="E:\\TMS_course\\src\\Unit9\\ForOutputTask3";
        File fileIn = new File(pathIn);
        File fileOut =new File(pathOut);
        Scanner scanner = new Scanner(fileIn);
        FileWriter writer=new FileWriter(fileOut);

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            StringBuilder rWord=new StringBuilder(word).reverse();
            if(word.equals(rWord.toString())){
                System.out.println(word);
                writer.write(word+"\n");
            }
        }
        writer.close();
    }
}
