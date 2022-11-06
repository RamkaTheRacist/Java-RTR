package Java.J_se_les9.HWV2.Core.UI.ConsoleIn;

import java.util.Scanner;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleIn;

public class ConsoleIn implements IConsoleIn {
    Scanner input;

    public ConsoleIn() {
        input = new Scanner(System.in);
    }

    @Override
    public int setNumberData() {
        Integer number = null;
        while (true) {
            try {
                number = Integer.parseInt(input.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Invalid data");
            }
        }
    }

    @Override
    public String setStringData() {
        return input.nextLine();
    }

    @Override
    public boolean setBooleanData() {
        while (true) {
            String tmp = input.nextLine();
            if (tmp.toLowerCase().equals("true") || tmp.toLowerCase().equals("false")) {
                return Boolean.parseBoolean(tmp);
            } else {
                System.out.println("Invalid data");
            }
        }
    }
}
