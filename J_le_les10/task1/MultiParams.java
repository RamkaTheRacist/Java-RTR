package Java.J_le_les10.task1;

public class MultiParams<E1, E2, E3> {
    public E1 value1;
    public E2 value2;
    public E3 value3;
    public MultiParams(E1 e1, E2 e2, E3 e3){
        this.value1 = e1;
        this.value2 = e2;
        this.value3 = e3;
        //value1 = e2; CANT CONVERT TYPES
    }
}
