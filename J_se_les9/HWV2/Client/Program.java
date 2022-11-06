package Java.J_se_les9.HWV2.Client;

import java.util.Scanner;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;
import Java.J_se_les9.HWV2.Core.Animals.Bird.BirdBase;
import Java.J_se_les9.HWV2.Core.Animals.Bird.Chicken;
import Java.J_se_les9.HWV2.Core.Animals.Bird.Stork;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Cat;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Dog;
import Java.J_se_les9.HWV2.Core.Animals.Pet.PetBase;
import Java.J_se_les9.HWV2.Core.Animals.Wild.Tiger;
import Java.J_se_les9.HWV2.Core.Animals.Wild.Wolf;
import Java.J_se_les9.HWV2.Core.Logic.Add.Add;
import Java.J_se_les9.HWV2.Core.Logic.GetInfo.GetInfo;
import Java.J_se_les9.HWV2.Core.Logic.IfHasHair.IfHasHair;
import Java.J_se_les9.HWV2.Core.Logic.MakingSounds.MakeSounds;
import Java.J_se_les9.HWV2.Core.Logic.Show.Show;
import Java.J_se_les9.HWV2.Core.Logic.Show.ShowBase;
import Java.J_se_les9.HWV2.Core.Logic.Training.Training;
import Java.J_se_les9.HWV2.Core.Logic.Weasel.Weasel;
import Java.J_se_les9.HWV2.Core.UI.App.App;
import Java.J_se_les9.HWV2.Core.UI.ConsoleIn.ConsoleIn;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.ConsoleErr;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.ConsoleSuc;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.Output;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class Program {
    public static void main(String[] args) {
        Cat ant = new Cat(123, 12, "null11", "null12", "null13", "null14", "null15", "null16", true);

        Dog ant1 = new Dog(23, 22, "null21", "null22", "null23", "null24", "null25", "null26", true);
        Stork ant2 = new Stork(532, 12344, "null3");
        Chicken ant3 = new Chicken(123, 423, "null4");
        Tiger ant4 = new Tiger(123, 321, "null51", "null52", "null53");
        Wolf ant5 = new Wolf(213, 12, "null61", "null62", "null63", false);
        new App().startApp();
    }
}
