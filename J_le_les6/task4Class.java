package Java.J_le_les6;

public class task4Class {
    int id;
    int salary;
    String firstName;
    String secondName;

    @Override
    public String toString() {
        return String.format("%d: %s %s %d", id, firstName, secondName, salary);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        task4Class t = (task4Class) o;
        return id == t.id && firstName == t.firstName;
    }
}
