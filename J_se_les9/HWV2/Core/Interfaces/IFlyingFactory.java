package Java.J_se_les9.HWV2.Core.Interfaces;

import Java.J_se_les9.HWV2.Core.Animals.Bird.BirdBase;

public interface IFlyingFactory {
    void flying(BirdBase bird, IConsoleIn input, IConsoleOutFly fly, IConsoleErr error,IMenu menu);
}
