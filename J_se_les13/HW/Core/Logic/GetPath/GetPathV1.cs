using HW.Core.Logic.Interfaces;
namespace HW.Core.Logic.GetPath
{
    public class GetPathV1 : IGetPath
    {
        public string GetPath(string path)
        {
            int tmp = path.LastIndexOf('\\');
            return path.Substring(0, tmp + 1);
        }
    }
}