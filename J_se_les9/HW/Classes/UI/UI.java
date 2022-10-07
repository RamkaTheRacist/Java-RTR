package Java.J_se_les9.HW.Classes.UI;

public class UI {
    public UI() {
    }

    public void mainMenu() {
        System.out.println();
        System.out.println(
                "Hello, you`re in Zoo. You can: \n(1)Add animal in zoo\n(2)Remove animal in zoo\n(3)Ask info about animal in zoo\n(4)Ask info about all animals in zoo\n(5)Force animal to make sounds\n(6)Force all animals to make sounds\n(7)Force animal to fly\n(8)Force animal to weasel\n(9)Force animal to train\n(0)Leave zoo");
    }

    public void actions(int choose) {
        switch (choose) {
            case 0:
                System.out.println("Bye bye");
                break;
            case 1:
                System.out.println("Which animal: (1)Cat, (2)Dog, (3)Tiger, (4)Wolf, (5)Stork, (6)Chicken");
                break;
            case 4:
            case 6:
                break;
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                System.out.println("Which animal: ");
                break;
            default:
                System.out.println("Choose right please");
                break;
        }
    }
}
