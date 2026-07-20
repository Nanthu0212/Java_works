import java.util.*;
public class Array_list {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("cherry");
        System.out.println(list);
        System.out.println("The size of the list is : " +list.size());
        System.out.println("The element at index 1 is : " +list.get(1));
        list.remove(1);
        System.out.println("The list after removing the element at index 1 is : " +list);
        System.out.println("The size of the list after removing the element is : " +list.size());

    }
    
}
