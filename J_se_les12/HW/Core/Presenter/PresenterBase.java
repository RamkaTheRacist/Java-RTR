package Java.J_se_les12.HW.Core.Presenter;

import Java.J_se_les12.HW.Core.Logic.Interfaces.ILFactory;

public abstract class PresenterBase {
    ILFactory factory;

    protected PresenterBase(ILFactory factory) {
        this.factory = factory;

    }

    public abstract void doThis();

}
