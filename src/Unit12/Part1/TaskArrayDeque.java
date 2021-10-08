package Unit12.Part1;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskArrayDeque {
    public static void main(String[] args) {
        Queue<String>queue=new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.add("C");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);

    }
}
