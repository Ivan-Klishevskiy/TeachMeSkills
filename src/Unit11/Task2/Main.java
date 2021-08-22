package Unit11.Task2;

import java.io.*;

public class Main {
    public static String funcReader(String fileName) {
        StringBuilder allTxt = new StringBuilder("");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                allTxt.append(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return allTxt.toString();
    }

    public static void funcWriter(String fileName,String txt){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(txt);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String txt=funcReader("src/Unit11/Task2/Task2Text.txt");
        txt=ParsingTxt.parsingFunc(txt);
        funcWriter("src/Unit11/Task2/Task2OutFile.txt",txt);
    }

}
