package AllClassWorks.ClassWork11;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileReader fileIn=null;
        FileWriter fileOut=null;

        try{
            fileIn=new FileReader("src/AllClassWorks/ClassWork11/file.txt");
            fileOut=new FileWriter("src/AllClassWorks/ClassWork11/copied_file.txt");

            int a;

            while((a=fileIn.read())!=-1){
                fileOut.write(a);
            }
        }finally {
            if(fileIn!=null){
                fileIn.close();
            }
            if(fileOut!=null){
                fileOut.close();
            }
        }
    }
}
