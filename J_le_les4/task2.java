package Java.J_le_les4;

import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        Queue<Integer> any = new LinkedList<Integer>();
        any.add(1);
        any.add(2);
        any.add(3);
        any.add(4);
        System.out.println(any);
        int tmp = any.remove(); // catch first in queue
        System.out.println(any);
        System.out.println(tmp);
    }

    

}
