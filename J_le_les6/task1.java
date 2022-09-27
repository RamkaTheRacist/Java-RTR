package Java.J_le_les6;

import java.util.HashSet;
import java.util.Set;

//HashSet
public class task1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); 
        set.add(12); 
        set.add(123); 
        set.add(1234); 
        set.add(132); 
        set.add(124); 
        set.add(151); 
        set.add(112); 
        System.out.println(set.contains(1));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(null);
        for (Integer item : set) {
            System.out.println(item);
        }
        set.clear();
        System.out.println(set);

    }
}
