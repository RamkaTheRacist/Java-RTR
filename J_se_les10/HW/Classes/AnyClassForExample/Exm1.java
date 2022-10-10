package Java.J_se_les10.HW.Classes.AnyClassForExample;

public class Exm1 {
    private String nameF;
    private String nameL;

    public Exm1(String nameF, String nameL) {
        this.nameF = nameF;
        this.nameL = nameL;
    }

    @Override
    public String toString() {
        return String.format("{\"nameF\": \"%s\", \"nameL\": \"%s\"}", nameF, nameL);
    }
}
