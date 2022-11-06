package Java.J_se_les9.HWV2.Core.Logic.Factory;

import Java.J_se_les9.HWV2.Core.Animals.Bird.BirdBase;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleIn;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOut;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOutFly;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;
import Java.J_se_les9.HWV2.Core.Interfaces.IFactory;
import Java.J_se_les9.HWV2.Core.Interfaces.IgetInfo;
import Java.J_se_les9.HWV2.Core.Interfaces.ImakeSound;
import Java.J_se_les9.HWV2.Core.Logic.Add.Add;
import Java.J_se_les9.HWV2.Core.Logic.GetInfo.GetInfo;
import Java.J_se_les9.HWV2.Core.Logic.MakingSounds.Force;
import Java.J_se_les9.HWV2.Core.Logic.MakingSounds.MakeSounds;
import Java.J_se_les9.HWV2.Core.Logic.Remove.Remove;
import Java.J_se_les9.HWV2.Core.Logic.Show.Show;
import Java.J_se_les9.HWV2.Core.Logic.Training.Training;
import Java.J_se_les9.HWV2.Core.Logic.Weasel.Weasel;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.MenuFlying;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class MainFactory implements IFactory {
    @Override
    public void makeOperation(String choose, Zoo zoo, IgetInfo info, ImakeSound sound, IConsoleErr error,
            IConsoleOut output, IConsoleIn input, IConsoleSuc suc, IConsoleOutFly fly) {
        int index = 0;
        switch (choose) {
            case "1":
                output.askForType();
                int type = input.setNumberData();
                if ((type > 0) & (type < 7)) {
                    new Add(zoo, input, output, suc).addAnimal(type);
                } else {
                    error.typeError();
                }
                break;
            case "2":
                output.askForIndex();
                index = input.setNumberData();
                if ((index >= zoo.animalsInZoo()) || (index < 0)) {
                    error.indexError();
                } else {
                    new Remove(zoo, suc, error).remove(index);
                }
                break;
            case "3":
                output.askForIndex();
                index = input.setNumberData();
                new Show(zoo, new GetInfo(), error).showAnimal(index);
                break;
            case "4":
                new Show(zoo, new GetInfo(), error).showAll();
                break;
            case "5":
                output.askForIndex();
                index = input.setNumberData();
                new Force(zoo, error, new MakeSounds()).forceToMakeSounds(index);
                break;
            case "6":
                new Force(zoo, error, new MakeSounds()).forceAll();
                break;
            case "7":
                output.askForIndex();
                index = input.setNumberData();
                if ((index >= zoo.animalsInZoo()) || (index < 0)) {
                    error.indexError();
                } else {
                    if(zoo.getAnimal(index) instanceof BirdBase){
                        new FlyingFactory().flying((BirdBase)zoo.getAnimal(index), input, fly, error, new MenuFlying());
                    }else{
                        error.flyError();
                    }
                }
                break;
            case "8":
                output.askForIndex();
                index = input.setNumberData();
                if ((index >= zoo.animalsInZoo()) || (index < 0)) {
                    error.indexError();
                } else {
                    new Weasel().weasel(zoo.getAnimal(index));
                }
                break;
            case "9":
                output.askForIndex();
                index = input.setNumberData();
                if ((index >= zoo.animalsInZoo()) || (index < 0)) {
                    error.indexError();
                } else {
                    new Training().training((zoo.getAnimal(index)));
                }
                break;
            case "0":
                break;
            default:
                error.commandError();
                break;
        }
    }
}