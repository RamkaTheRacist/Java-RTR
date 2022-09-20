package Java.J_le_les5;
import java.util.HashMap;
//HashMap
import java.util.Map;
public class task1 {
    public static void main(String[] args) {
        Map<Integer,String> any = new HashMap<Integer, String>(); // or <"empty">
        //Map<Integer,String> any = new HashMap<Integer, String>(size);
        //Map<Integer,String> any = new HashMap<Integer, String>(size, 1.0f); // % of fill before changes size
        any.putIfAbsent(1, "one"); // проверка есть ли такой ключ
        any.put(2, "two");
        any.put(null,"!null");
        System.out.println(any);
        System.out.println(any.get(44)); // return null if no match key
        for (var item : any.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(),item.getValue());
        }
    }
}
