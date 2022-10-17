package Java.J_se_les11.HW.Client;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;

public class Program {
    public static void main(String[] args) {
        Contact any1 = new Contact("null", "null", "null", 123, "null");
        Contact any2 = new Contact("null", "null", "null", 123, "null");
        System.out.println(any1.getfName());
        System.out.println(any1.equals(any2));
        System.out.println(any1.compareTo(any2));
    }
}
