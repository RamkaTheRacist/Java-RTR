package Java.J_se_les9.HWV2.Core.Logic.Show;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Logic.GetInfo.GetInfo;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public abstract class ShowBase {
    Zoo zoo;
    IConsoleErr error;
    GetInfo info;
    protected ShowBase(Zoo zoo, GetInfo info, IConsoleErr error) {
        this.zoo = zoo;
        this.error = error;
        this.info = info;
    }

    public abstract void showAnimal(int index);
}
