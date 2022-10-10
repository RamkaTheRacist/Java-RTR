package Java.J_se_les10.HW;

import java.io.File;
import java.io.IOException;

import Java.J_se_les10.HW.Classes.AnyClassForExample.Exm1;
import Java.J_se_les10.HW.Classes.AnyClassForExample.Exm3;
import Java.J_se_les10.HW.Classes.FileReader.FileRead;

public class Program {
    public static void main(String[] args) throws IOException {
        Exm1 exm1 = new Exm1("anyfirstname", "anylastname");
        Exm3 exm3 = new Exm3("anyname", 15);
        File file1 = new File("Java\\J_se_les10\\HW\\files\\file1.json");
        File file2 = new File("Java\\J_se_les10\\HW\\files\\file2.json");
        File file3 = new File("Java\\J_se_les10\\HW\\files\\file3.json");
        File file5 = new File("Java\\J_se_les10\\HW\\files\\file5.json");
        FileRead tmp1 = new FileRead(file1.getAbsolutePath());
        System.out.println(tmp1.<String>readData(String.class));
        System.out.println(tmp1.<String>readData(String.class).getClass().getName());
        FileRead tmp2 = new FileRead(file2.getAbsolutePath());
        System.out.println(tmp2.<Integer>readData(int.class));
        System.out.println(tmp2.<Integer>readData(int.class).getClass().getName());
        FileRead tmp3 = new FileRead(file3.getAbsolutePath());
        System.out.println(tmp3.<Exm1>readData(Exm1.class));
        System.out.println(tmp3.<Exm1>readData(Exm1.class).getClass().getName());
        FileRead tmp5 = new FileRead(file5.getAbsolutePath());
        System.out.println(tmp5.<Exm3>readData(Exm3.class));
        System.out.println(tmp5.<Exm3>readData(Exm3.class).getClass().getName());
    }
}