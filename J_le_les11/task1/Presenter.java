package Java.J_le_les11.task1;

public class Presenter {
    View view;
    IModel model;
    public Presenter(IModel m, View v){
        model = m;
        view = v;
    }
    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }

}
