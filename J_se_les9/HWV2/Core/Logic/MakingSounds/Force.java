package Java.J_se_les9.HWV2.Core.Logic.MakingSounds;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Interfaces.IForce;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class Force implements IForce {
    Zoo zoo;
    IConsoleErr error;
    MakeSounds sound;

    public Force(Zoo zoo, IConsoleErr error, MakeSounds sound) {
        this.zoo = zoo;
        this.error = error;
        this.sound = sound;
    }

    @Override
    public void forceToMakeSounds(int index) {
        if (zoo.animalsInZoo() > 0) {
            if ((index >= zoo.animalsInZoo()) || (index < 0)) {
                error.indexError();
            } else {
                sound.makeSound(zoo.getAnimal(index));
            }
        } else {
            error.emptyError();
        }
    }

    public void forceAll() {
        if (zoo.animalsInZoo() > 0) {
            for (int i = 0; i < zoo.animalsInZoo(); i++) {
                sound.makeSound(zoo.getAnimal(i));
            }
        } else {
            error.emptyError();
        }
    }
}
