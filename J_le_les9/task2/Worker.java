package Java.J_le_les9.task2;

import java.util.Iterator;

public class Worker implements Iterator<String>, Comparable<Worker> {
    protected String fname;
    protected String sname;
    protected Integer age;

    public Worker(String fname, String sname, Integer age) {
        this.fname = fname;
        this.sname = sname;
        this.age = age;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("FN: %s", fname);
            default:
                return String.format("SN: %s", sname);

        }
    }

    @Override
    public int compareTo(Worker o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else
            return 0;
    }
}