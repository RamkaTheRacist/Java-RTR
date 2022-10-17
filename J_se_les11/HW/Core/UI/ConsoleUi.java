package Java.J_se_les11.HW.Core.UI;

import Java.J_se_les11.HW.Core.Logic.MVP.IView;
import java.util.Scanner;

public class ConsoleUi implements IView {
    Scanner input;

    public ConsoleUi() {
        input = new Scanner(System.in);
    }

    @Override
    public String getfName() {
        System.out.println("First name: ");
        return input.nextLine();
    }

    @Override
    public void setfName(String value) {
        System.out.printf("First name: %s\n", value);

    }

    @Override
    public String getlName() {
        System.out.println("Last name: ");
        return input.nextLine();
    }

    @Override
    public void setlName(String value) {
        System.out.printf("Last name: %s\n", value);

    }

    @Override
    public String getOrganisation() {
        System.out.println("Organisation: ");
        return input.nextLine();
    }

    @Override
    public void setOrganisation(String value) {
        System.out.printf("Organisation: %s\n", value);

    }

    @Override
    public Integer getPhoneNumber() {
        System.out.println("Phone number: ");
        return Integer.parseInt(input.nextLine());
    }

    @Override
    public void setPhoneNumber(int value) {
        System.out.printf("Phone number: %d\n", value);

    }

    @Override
    public String getNote() {
        System.out.println("Note: ");
        return input.nextLine();
    }

    @Override
    public void setNote(String value) {
        System.out.printf("Note: %s\n", value);

    }

    @Override
    public void showPosition(int value) {
        System.out.printf("Position of current contact: %d\n", value);

    }

    @Override
    public void empty() {
        System.out.println("Current phonebook is empty");

    }

    @Override
    public void showAllPos(int value) {
        System.out.printf("%d entries in current phonebook\n", value);

    }

    @Override
    public Integer searchIndex() {
        System.out.println("Entry`s position: ");
        return Integer.parseInt(input.nextLine());

    }

    @Override
    public void errorIndex() {
        System.out.println("You dont have entry with such position");

    }

    @Override
    public Integer chooseType() {
        System.out.println("Save as: (1).txt (2).db (3).csv ");
        return Integer.parseInt(input.nextLine());
    }

    @Override
    public String chooseName() {
        System.out.println("File name: ");
        return input.nextLine();
    }

    @Override
    public void errorAdd() {
        System.out.println("Such entry exists already");

    }

    @Override
    public void addSuccess() {
        System.out.println("Entry successfully added");

    }

    @Override
    public void removeSuccess() {
        System.out.println("Entry successfully removed");

    }

    @Override
    public void updateSuccess() {
        System.out.println("Entry successfully updated");

    }

    @Override
    public void saveSuccess() {
        System.out.println("Successfully saved");

    }

}
