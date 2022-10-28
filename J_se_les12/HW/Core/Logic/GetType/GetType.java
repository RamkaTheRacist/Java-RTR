package Java.J_se_les12.HW.Core.Logic.GetType;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IGetType;

public class GetType implements IGetType {

    @Override
    public String getType(String path) {
        int tmp = path.indexOf('.');
        return path.substring(tmp + 1);
    }
}
