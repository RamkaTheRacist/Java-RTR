package Java.J_se_les12.HW.Core.UI.ConsoleInput;

import java.util.Scanner;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;

public class ConsoleInputV1 implements IConsoleInput {
    Scanner input;

    public ConsoleInputV1() {
        input = new Scanner(System.in);
    }

    @Override
    public String setfName() {
        System.out.println("First name: ");
        return input.nextLine();
    }

    @Override
    public String setlName() {
        System.out.println("Last name: ");
        return input.nextLine();
    }

    @Override
    public String setOrganisation() {
        System.out.println("Organisation: ");
        return input.nextLine();
    }

    @Override
    public Integer setPhoneNumber() {
        Integer phonenumber = null;
        System.out.println("Phone number: ");
        while (true) {
            try {

                phonenumber = Integer.parseInt(input.nextLine());
                return phonenumber;
            } catch (Exception e) {
                System.out.println("Invalid phone number");
            }
        }
    }

    @Override
    public String setNote() {
        System.out.println("Note: ");
        return input.nextLine();
    }

    @Override
    public Integer searchIndex() {
        Integer index = null;
        System.out.println("Entry`s position: ");
        while (true) {
            try {

                index = Integer.parseInt(input.nextLine());
                return index;
            } catch (Exception e) {
                System.out.println("Invalid index");
            }
        }
    }

    @Override
    public String chooseName() {
        System.out.println("File name and type: ");
        return input.nextLine();
    }

    public String getCommand() {
        return input.nextLine();
    }
}