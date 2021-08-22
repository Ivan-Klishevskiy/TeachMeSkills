package AllClassWorks.ClassWork11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader("src/AllClassWorks/ClassWork11/notes4.txt"))){
            String s;
            while ((s=br.readLine())!=null){
                System.out.print(s);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
