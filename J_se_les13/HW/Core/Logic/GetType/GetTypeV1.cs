using HW.Core.Logic.Interfaces;
namespace HW.Core.Logic.GetType
{
    public class GetTypeV1 : IGetType
    {
        public string GetType(string path)
        {
            int tmp = path.LastIndexOf('.');
            return path.Substring(tmp + 1);
        }
    }
}