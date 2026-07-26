import java.util.*;
public class Que_linkedlist {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        System.out.println(queue1);

    }
    
}
