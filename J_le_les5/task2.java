package Java.J_le_les5;

import java.util.TreeMap;

//TreeMap
//Упорядочивает по ключу
//Указывать метод сравнение
public class task2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1, "one");
        tMap.put(3, "three");
        tMap.put(5, "five");
        tMap.put(2, "two");
        tMap.put(6, "six");
        System.out.println(tMap);
    }
}
