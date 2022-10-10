package Java.J_se_les10.HW.Classes.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Java.J_se_les10.HW.Classes.AnyClassForExample.Exm1;
import Java.J_se_les10.HW.Classes.AnyClassForExample.Exm3;

public class FileRead {
    private String filePath;

    public FileRead(String filePath) {
        this.filePath = filePath;
    }

    private String getData() throws IOException {
        String result;
        BufferedReader reader = new BufferedReader(new FileReader(this.filePath));
        result = reader.readLine();
        reader.close();
        return result;
    }

    private String[] parseData(String data) {
        String tmpForThisMethod = data.replaceAll("\\s", "");
        StringBuilder value = new StringBuilder(tmpForThisMethod.replaceAll("\"", ""));
        value.deleteCharAt(0);
        value.deleteCharAt(value.length() - 1);
        String[] tmp = value.toString().split(",");
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < tmp.length; i++) {
            String[] tmpArray = tmp[i].split(":");
            for (int j = 0; j < tmpArray.length; j++) {
                array.add(tmpArray[j]);
            }
        }
        String[] result = new String[array.size()];
        result = array.toArray(result);
        return result;
    }

    public <E> E readData(Class<E> className) throws IOException {
        String tmp = getData();
        if (className == int.class) {
            String[] tmpArr = parseData(tmp);
            String tmpRes = tmpArr[1];
            Object result = Integer.parseInt(tmpRes);
            return (E) result;
        } else if (className == String.class) {
            String[] tmpArr = parseData(tmp);
            Object tmpRes = tmpArr[1];
            return (E) tmpRes;
        } else if (className == Exm1.class) {
            String[] tmpArr = parseData(tmp);
            Object result = new Exm1(tmpArr[1], tmpArr[3]);
            return (E) result;
        } else if (className == Exm3.class) {
            String[] tmpArr = parseData(tmp);
            Object result = new Exm3(tmpArr[1], Integer.parseInt(tmpArr[3]));
            return (E) result;
        } else {
            return null;
        }
    }

}
