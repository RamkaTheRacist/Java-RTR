package Java.J_se_les10.task1;
import java.io.IOException;

import Java.J_se_les10.task1.Classes.TestClass;
import Java.J_se_les10.task1.Classes.Json.Manager;

public class Program {
    public static void main(String[] args) throws IOException {
        Manager any = new Manager("file.json");
        TestClass any2 = new TestClass("TestClass", 666);
        any.prnt();
        any.format("any1", any2);
        any.prnt();
        any.writeData(true);
        any.readData();
        // any.prnt();
        // any.format("any1", "anty");
        // any.prnt();
        // any.format("any1", 13);
        // any.prnt();
        // any.format("any3", any2);
        // any.prnt();

    }
}
