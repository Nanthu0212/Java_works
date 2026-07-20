import java.util.*;
public class Hash_list {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("banana");
        set.add("cherry");
        System.out.println(set);
        System.out.println("The size of the set is : " +set.size());
        System.out.println("The set contains 'banana' : " +set.contains("banana"));
        set.remove("banana");
        System.out.println("The set after removing 'banana' is : " +set);
        System.out.println("The size of the set after removing 'banana' is : " +set.size());
    }
    
}
