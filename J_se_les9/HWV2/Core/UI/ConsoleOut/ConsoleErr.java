package Java.J_se_les9.HWV2.Core.UI.ConsoleOut;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;

public class ConsoleErr implements IConsoleErr{

    @Override
    public void indexError() {
        System.out.println("Animal with such index doesnt exist");
    }

    @Override
    public void commandError() {
        System.out.println("Invalid command");
    }

    @Override
    public void flyError() {
        System.out.println("This animal cant fly by itself");
    }

    @Override
    public void emptyError() {
        System.out.println("Zoo is empty");
    }

    @Override
    public void typeError() {
        System.out.println("You dont have such type of animal"); 
    }

    @Override
    public void hightError() {
        System.out.println("This bird cant fly so hight");
    }
    
}
