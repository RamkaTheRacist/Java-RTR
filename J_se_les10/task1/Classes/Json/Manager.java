package Java.J_se_les10.task1.Classes.Json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class Manager {
    private String filePath;
    private String tmp;
    public Manager(String filePath) {
        this.filePath = filePath;
    }

    public <E1, E2> void format(String firstValue, E2 secondValue){
        if(secondValue instanceof Number){
            this.tmp = String.format("\"%s\": %d",firstValue, secondValue);
        }else if (secondValue instanceof String){
            this.tmp = String.format("\"%s\": \"%s\"",firstValue, secondValue);
        }
        else{
            this.tmp = String.format("\"%s\": %s",firstValue, secondValue.toString());
        }
    }
    public void prnt(){
        System.out.println(this.tmp);
    }



    public void writeData(Boolean add) throws IOException{
        FileWriter writer = new FileWriter(this.filePath, add);
        {
            writer.write("{");
            writer.write(this.tmp);
            writer.write("}");
            writer.flush();
            
        } 
    }

    public Boolean checkIfEmpty(){
        Boolean checked = true;
        try(FileReader reader = new FileReader(this.filePath))
        {
            int c;
            if((c=reader.read())!=-1){
                checked = false;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return checked;     
    }


    public void readData(){
        try(FileReader reader = new FileReader(this.filePath))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){
                 
                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }       
    }

}
