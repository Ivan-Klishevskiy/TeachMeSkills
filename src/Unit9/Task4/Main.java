package Unit9.Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileIn = new File("E:\\TMS_course\\src\\Unit9\\Task4\\Text");
        File fileOut =new File("E:\\TMS_course\\src\\Unit9\\Task4\\OutTxt");
        Scanner scanner =new Scanner(fileIn);
        StringBuilder allLine= new StringBuilder();
        FileWriter writer=new FileWriter(fileOut);
        //чтение из файла в один String
        while (scanner.hasNextLine()){
            allLine.append(scanner.nextLine());
        }
        writer.write(ParsingTxt.parsingFunc(allLine.toString()));
        writer.close();
    }
}
