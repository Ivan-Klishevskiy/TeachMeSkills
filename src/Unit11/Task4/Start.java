package Unit11.Task4;

import java.io.*;

public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream=new FileOutputStream("src/Unit11/Task4/save.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        Car car=new Car("Tesla",400,29950);
        objectOutputStream.writeObject(car);
        objectOutputStream.close();

        car=null;

        FileInputStream fileInputStream=new FileInputStream("src/Unit11/Task4/save.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Car newCar=(Car) objectInputStream.readObject();
        System.out.println(newCar);
    }
}
