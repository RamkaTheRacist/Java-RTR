package Java.J_se_les10.task1.Classes;

public class TestClass {
    private String name;
    private int age;
    public TestClass(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("{\"name\": \"%s\",\"age\": %d}", this.name, this.age);
    }
}
