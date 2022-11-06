package Java.J_se_les9.HWV2.Core.Presenter;

import Java.J_se_les9.HWV2.Core.Interfaces.IFactory;

public abstract class PresenterBase {
    IFactory factory;

    protected PresenterBase(IFactory factory) {
        this.factory = factory;
    }

    public abstract void doThis();
}
