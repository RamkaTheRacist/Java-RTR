package Java.J_se_les9.HWV2.Core.UI.ConsoleOut;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;

public class ConsoleSuc implements IConsoleSuc{
    @Override
    public void addSuc() {
        System.out.println("Animal successfully was added into Zoo");
    }
    @Override
    public void removeSuc() {
        System.out.println("Animal successfully was thrown out Zoo");
        
    }
    
}
