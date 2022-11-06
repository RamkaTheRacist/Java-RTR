package Java.J_se_les9.HWV2.Core.Logic.Show;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Logic.GetInfo.GetInfo;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class Show extends ShowBase {

    public Show(Zoo zoo, GetInfo info, IConsoleErr error) {
        super(zoo, info, error);
    }

    @Override
    public void showAnimal(int index) {
        if (zoo.animalsInZoo() > 0) {
            if ((index >= zoo.animalsInZoo()) || (index < 0)) {
                error.indexError();
            } else {
                new GetInfo().getInfo(zoo.getAnimal(index));
            }
        } else {
            error.emptyError();
        }
    }

    public void showAll() {
        if (zoo.animalsInZoo() > 0) {
            for (int i = 0; i < zoo.animalsInZoo(); i++) {
                new GetInfo().getInfo(zoo.getAnimal(i));
            }
        } else {
            error.emptyError();
        }
    }
}
