package Java.J_se_les9.HWV2.Core.Interfaces;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public interface IFactory {
    void makeOperation(String choose, Zoo zoo, IgetInfo info, ImakeSound sound, IConsoleErr error, IConsoleOut output, IConsoleIn input, IConsoleSuc suc, IConsoleOutFly fly);
}
