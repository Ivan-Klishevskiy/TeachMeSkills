package AllClassWorks.ClassWork12Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    private String name;
    private int group;
    private int course;
    private int mark;

    public Student(String name, int group, int course, int mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", mark=" + mark +
                '}';
    }
}

public class Task5 {

    void removeIfLess(List<Student> students){
        students.removeIf(i->i.getMark()<3);
        students.forEach(i->i.setCourse(i.getCourse()+1));
    }

    void printStudent(List<Student>students,int course){
        students.stream().filter(i->i.getCourse()==course).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Collections.addAll(students,new Student("Ivan",950503,3,10)
                ,new Student("Victor",950501,2,2)
                ,new Student("Kirill",95056,3,3));
        Task5 task= new Task5();
        task.removeIfLess(students);
        task.printStudent(students,4);

    }
}
