package Java.J_se_les9.HW.Classes.ReadData;

import java.util.Scanner;

public class ReadData {
    private String stringValue;
    private Integer intValue;
    Scanner iScanner = new Scanner(System.in);

    public ReadData() {

    }

    public Integer getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setIntValue() {
        int intData = iScanner.nextInt();
        intValue = intData;
    }

    public void setStringValue() {
        String stringData = iScanner.nextLine();
        stringValue = stringData;
    }
}
