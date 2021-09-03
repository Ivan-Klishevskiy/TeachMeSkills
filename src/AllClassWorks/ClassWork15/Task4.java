package AllClassWorks.ClassWork15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    private List<String> list;
    private  int age;
    private String name;

    public Person(List<String> list, int age, String name) {
        this.list = list;
        this.age = age;
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Task4 {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        List<String> jon=List.of("fdgskj","Jgdfgfd","gdfdgerh");
        List<String> rob=List.of("dgfdgfd","hytjt","jytjy");
        List<String> non=List.of("Jhjyytjyt","gkgdf","phtrk");
        Collections.addAll(people,new Person(jon,28,"Jon"), new Person(rob,29,"Rob"),new Person(non,15,"Non"));
        people.stream()
                .filter(person -> person.getAge() >= 18)
                .forEach(person -> {
                    List<String> hobbiesStartsWithJ = person.getList()
                            .stream()
                            .filter(j -> j.startsWith("J"))
                            .collect(Collectors.toList());
                    if (!hobbiesStartsWithJ.isEmpty()) {
                        System.out.println(person.getName());
                        System.out.println("Hobies :");
                        System.out.println(hobbiesStartsWithJ.toString());
                        System.out.println("------");
                    }
                });
    }
}
