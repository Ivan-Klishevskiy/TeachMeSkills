package AllClassWorks.ClassWork8.Task2;

public class Start {
    public static void main(String[] args) {
        Veterinarian veterinarian=new Veterinarian();
        Animal[]animals=new Animal[3];
        animals[0]=new Cat("fish","Belarus","Jora");
        animals[1]=new Dog("meat","Israel",2000);
        animals[2]=new Horse("Weed","Russia",60);
        for(Animal step: animals){
            veterinarian.treatAnimal(step);
        }
    }
}
