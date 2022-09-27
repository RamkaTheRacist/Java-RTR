package Java.J_le_les6;

import java.util.Arrays;
import java.util.HashSet;

public class task4 {
    public static void main(String[] args) {
        task4Class worker1 = new task4Class();
        worker1.id = 1;
        worker1.salary = 42;
        worker1.firstName = "Name1";
        worker1.secondName = "SName1";

        task4Class worker2 = new task4Class();
        worker2.id = 2;
        worker2.salary = 12;
        worker2.firstName = "Name2";
        worker2.secondName = "SName2";

        task4Class worker3 = new task4Class();
        worker3.id = 3;
        worker3.salary = 152;
        worker3.firstName = "Name3";
        worker3.secondName = "SName3";

        task4Class worker4 = new task4Class();
        worker4.id = 1;
        worker4.salary = 42;
        worker4.firstName = "Name1";
        worker4.secondName = "SName1";

        var workers = new HashSet<task4Class>(Arrays.asList(worker1,worker2,worker3));
        System.out.println(worker1.toString());
        System.out.println(worker1.equals(worker4));
        System.out.println(workers.contains(worker4));

    }
}
