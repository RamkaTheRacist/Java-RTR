package Java.J_le_les5;

import java.util.HashMap;
import java.util.Map;

//HashTable
//Устаревший
//не хранит null
public class task4 {
    public static void main(String[] args) {
        Map<Integer,String> table = new HashMap<>();
        table.put(1, "one");
        table.put(11, "one one");
        table.put(2, "two");
        System.out.println(table);
    }
}
