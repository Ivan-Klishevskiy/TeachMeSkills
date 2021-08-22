package AllClassWorks.ClassWork11;

import java.io.File;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException {
        String nameDir="src/AllClassWorks/ClassWork11/Test/TestInTest";
        String nameFile="src/AllClassWorks/ClassWork11/Test/TestInTest/newFile.txt";
        File a=new File(nameDir);
        System.out.println(a.mkdirs());
        File b=new File(nameFile);
        System.out.println(b.createNewFile());
    }
}
