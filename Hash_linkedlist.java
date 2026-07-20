import java.util.*;
public class Hash_linkedlist {
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(50);
        set.add(20);
        set.add(10);
        System.out.println(set);
        System.out.println("The size of the set is : " +set.size());
        System.out.println("The set contains 20 : " +set.contains(20));
        set.remove(20);
        System.out.println("The set after removing 20 is : " +set);
        System.out.println("The size of the set after removing 20 is : " +set.size());
    }
    
}
