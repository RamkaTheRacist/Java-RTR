package Java.J_se_les9.HWV2.Core.Logic.Remove;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class Remove extends RemoveBase {

    public Remove(Zoo zooList, IConsoleSuc suc, IConsoleErr error) {
        super(zooList, suc, error);
    }

    @Override
    public void remove(int index) {
        if (zooList.animalsInZoo() > 0) {
            zooList.remove(index);
            suc.removeSuc();
        }else{
            error.emptyError();
        }
    }
}
