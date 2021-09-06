package AllClassWorks.ClassWork13Part2;

import java.util.function.Consumer;

class HeavyBox {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

public class Task5 {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(200);
        Consumer<HeavyBox> first = i -> System.out.println("Отгрузили ящик с весом " + i.getWeight());
        Consumer<HeavyBox>second = i-> System.out.println("Отправляем ящик с весом "+i.getWeight());
        first.andThen(second).accept(heavyBox);
    }
}
