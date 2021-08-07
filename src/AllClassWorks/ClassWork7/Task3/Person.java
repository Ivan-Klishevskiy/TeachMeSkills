package AllClassWorks.ClassWork7.Task3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = null;
        this.age = 0;
    }

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        Person first = new Person("Ivan", 20);
        Person second = new Person();
    }

}
