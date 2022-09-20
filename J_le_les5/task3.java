package Java.J_le_les5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap
//Помнит порядок добавления
//Более медленный
public class task3 {
    public static void main(String[] args) {
        Map<Integer,String> linkMap = new LinkedHashMap<>();
        linkMap.put(11, "one one");
        linkMap.put(1, "alone");
        linkMap.put(2, "two");
        System.out.println(linkMap);
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "one one");
        map.put(1, "alone");
        map.put(2, "two");
        System.out.println(map);
    }
}
