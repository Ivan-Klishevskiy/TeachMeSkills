package AllClassWorks.ClassWork11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Task8 {
    public static void main(String[] args) {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/AllClassWorks/ClassWork11/person.dat"))){
            Person p=(Person) ois.readObject();
            System.out.println(p.getName()+" "+p.getAge());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
