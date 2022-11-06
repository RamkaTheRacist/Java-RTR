package Java.J_se_les9.HWV2.Core.UI.ConsoleOut;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOut;

public class Output implements IConsoleOut {

    @Override
    public void askForHight() {
        System.out.println("Hight: ");
    }

    @Override
    public void askForWeight() {
        System.out.println("Weight: ");
    }

    @Override
    public void askForEyeColor() {
        System.out.println("Eye Color: ");
    }

    @Override
    public void askForName() {
        System.out.println("Name: ");
    }

    @Override
    public void askForBreed() {
        System.out.println("Breed: ");
    }

    @Override
    public void askForGrafted() {
        System.out.println("Grafted: ");
    }

    @Override
    public void askForHairColor() {
        System.out.println("Hair Color: ");
    }

    @Override
    public void askForBD() {
        System.out.println("BD: ");
    }

    @Override
    public void askForHairs() {
        System.out.println("Has Hairs: ");
    }

    @Override
    public void askForTrainig() {
        System.out.println("Has Training: ");
    }

    @Override
    public void askForBoss() {
        System.out.println("If Boss: ");
    }

    @Override
    public void askForLivLoc() {
        System.out.println("Living Location: ");
    }

    @Override
    public void askForLocData() {
        System.out.println("Locate Data: ");
    }

    @Override
    public void askForType() {
        System.out.println("(1)Cat\n(2)Dog\n(3)Tiger\n(4)Wolf\n(5)Chicken\n(6)Stork\n");
    }

    @Override
    public void askForIndex() {
        System.out.println("Index: ");
    }
}
