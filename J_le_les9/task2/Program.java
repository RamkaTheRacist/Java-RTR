package Java.J_le_les9.task2;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Worker worker = new Worker("null", "nill", 22);
        Worker worker2 = new Worker("null", "nill", 18);
        Iterator<String> comp = worker;
        while(comp.hasNext()){
            System.out.println(worker.next());
        }
        
        
    }
}
