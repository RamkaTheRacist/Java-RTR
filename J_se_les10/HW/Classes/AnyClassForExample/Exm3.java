package Java.J_se_les10.HW.Classes.AnyClassForExample;

public class Exm3 {
    private String name;
    private Integer age;

    public Exm3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("{\"name\": \"%s\", \"age\": %d}", name, age);
    }
}
