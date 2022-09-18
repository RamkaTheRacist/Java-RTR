package Java.J_le_les3;

public class task1 {
    public static void main(String[] args) {
        System.out.println(Sum(0.01, "1"));
    }
/////////////////////////////////////////////////////////////////////////////////////////  Только в крайнем случаи использовать Obj.
    static Object Sum(Object a, Object b) {
        // if (a instanceof Double && b instanceof Double) {
        // return (Object) ((Double) a + (Double) b);
        // } else if (a instanceof Integer && b instanceof Integer) {
        // return (Object) ((Integer) a + (Integer) b);
        // } else
        // return -1;
        if (a instanceof Integer) {
            if (b instanceof Integer) {
                return (Object) ((Integer) a + (Integer) b);
            } else if (b instanceof Double) {
                return (Object) ((Integer) a + (Double) b);
            } else return null;
        } else if (a instanceof Double) {
            if (b instanceof Integer) {
                return (Object) ((Double) a + (Integer) b);
            } else if (b instanceof Double) {
                return (Object) ((Double) a + (Double) b);
            }else return null;
        } else
            return null;
    }
}
