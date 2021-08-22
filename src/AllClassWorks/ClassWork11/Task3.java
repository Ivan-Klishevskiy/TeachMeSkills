package AllClassWorks.ClassWork11;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("src/AllClassWorks/ClassWork11/notes4.txt"))){
            String text="Hello world!\nHey! Teachers!\nLeave them kids alone";
            bw.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
