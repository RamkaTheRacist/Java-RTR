package Java.J_se_les9.task1.Classes.Base;

public abstract class Base {
    protected String name;
    public Base(String name){
        this.name = name;
    }
    public Base(){
        this("Random name");
    }
}
