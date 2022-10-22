package Java.J_se_les11.HW.Core.UI;

import Java.J_se_les11.HW.Core.Logic.MVP.IView;
import Java.J_se_les11.HW.Core.Logic.MVP.Presenter;
import Java.J_se_les11.HW.Core.Logic.RemoveLogic.ConsoleR;
import Java.J_se_les11.HW.Core.Logic.RemoveLogic.IConsoleR;
import Java.J_se_les11.HW.Core.Logic.SaveLogic.ConsoleS;
import Java.J_se_les11.HW.Core.Logic.SaveLogic.IConsoleS;
import Java.J_se_les11.HW.Core.Logic.UpdateLogic.ConsoleU;
import Java.J_se_les11.HW.Core.Logic.UpdateLogic.IConsoleU;

import java.util.Scanner;

public class App {
    public static void app() {
        System.out.print("\033[H\033[J");
        boolean end = false;
        IView view = new ConsoleUi();
        IConsoleS consoleS = new ConsoleS();
        IConsoleR consoleR = new ConsoleR();
        IConsoleUIErr error = new ConsoleUIErr();
        IConsoleU consoleU = new ConsoleU();
        
        String path = "Java\\J_se_les11\\HW\\Files\\any.txt";
        Presenter pres = new Presenter(path, view, consoleS,consoleR,consoleU,error);
        pres.loadFile();
        try (Scanner in = new Scanner(System.in)) {
            while (end == false) {
                System.out.println();
                System.out.println(
                        "(1)Show all contacts\n(2)Show how much positions in phonebook\n(3)Show contact one by one\n(4)Show contact by index\n(5)Add contact\n(6)Save file\n(7)Save as\n(0)Leave\n");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        pres.showAllContacts();
                        break;
                    case "2":
                        pres.showAllContAsNumb();
                        break;
                    case "3":
                        Boolean tmpEnd = false;
                        while (tmpEnd == false) {
                            pres.showContact();
                            System.out.println(
                                    "(1)Next contact\n(2)Prev contact\n(3)Remove this contact\n(4)Update this contact\n(0)Back\n");
                            String any = in.next();
                            switch (any) {
                                case "1":
                                    pres.next();
                                    break;
                                case "2":
                                    pres.prev();
                                    break;
                                case "3":
                                    pres.remove();
                                    break;
                                case "4":
                                    pres.update();
                                    break;
                                case "0":
                                    tmpEnd = true;
                                    break;
                                default:
                                    System.out.println("Havent such command");
                                    break;

                            }
                            System.out.print("\033[H\033[J");
                        }
                        break;
                    case "4":
                        pres.showContactWithIndex();
                        break;
                    case "5":
                        pres.add();
                        break;
                    case "6":
                        pres.save();
                        break;
                    case "7":
                        pres.saveAs();
                        break;
                    case "0":
                        end = true;
                        break;

                    default:
                        System.out.println("Havent such command");
                        break;
                }
            }
        }
    }
}
