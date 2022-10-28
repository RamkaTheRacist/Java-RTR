package Java.J_se_les12.HW.Core.Logic.GetPath;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IGetPath;

public class GetPath implements IGetPath {

    @Override
    public String getPath(String path) {
        int tmp = path.lastIndexOf('\\');
        return path.substring(0, tmp + 1);
    }

}
