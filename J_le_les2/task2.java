package Java.J_le_les2;

import java.io.File;

public class task2 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        ////////////////////////////////////////////////////////////////////// Для каталогов ///////////////////////////////////////
        // String pathProject = System.getProperty("user.dir");
        // String pathDir = pathProject.concat("/files");
        // File dir = new File(pathDir);
        // System.out.println(dir.getAbsolutePath());
        // if (dir.mkdir()) {
        //     System.out.println("+");
        // } else {
        //     System.out.println("-");
        // }
        // for (String fname : dir.list()) {
        //     System.out.println(fname);
        // } 
    }
}
