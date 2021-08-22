package AllClassWorks.ClassWork11;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader("src/AllClassWorks/ClassWork11/notes4.txt"))){
            int c;
            while ((c=br.read())!=-1){
                System.out.print((char)c);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
