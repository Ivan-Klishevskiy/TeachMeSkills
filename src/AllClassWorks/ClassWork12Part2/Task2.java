package AllClassWorks.ClassWork12Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HeavyBox{
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}

public class Task2 {
    public static void main(String[] args) {
        List<HeavyBox>list = new ArrayList<>();
        Collections.addAll(list,new HeavyBox(5),new HeavyBox(2),new HeavyBox(3),new HeavyBox(4));
        list.forEach(System.out::println);
        list.get(0).setWeight(1);
        list.forEach(System.out::println);
    }
}
