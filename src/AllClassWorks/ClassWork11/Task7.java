package AllClassWorks.ClassWork11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Task7 {
    public static void main(String[] args) {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/AllClassWorks/ClassWork11/person.dat"))) {
            Person p=new Person("Sam",23,189,true);
            oos.writeObject(p);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

class Person implements Serializable{
    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
