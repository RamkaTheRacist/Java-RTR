using HW.Core.Logic.Interfaces;
namespace HW.Core.Presenter
{
    public abstract class PresenterBase
    {
        public ILFactory Factory { get; set; }
        protected PresenterBase(ILFactory factory)
        {
            Factory = factory;
        }
        public abstract void DoThis();
    }
}