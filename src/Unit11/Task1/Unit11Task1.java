package Unit11.Task1;

import java.io.*;

public class Unit11Task1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Unit11/Task1/Task1InFile.txt"))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Unit11/Task1/Task1OutFile.txt"))) {
                String line;
                while ((line= reader.readLine())!=null){
                    StringBuilder rWord=new StringBuilder(line).reverse();
                    if(line.equals(rWord.toString())){
                        writer.write(line+"\n");
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
