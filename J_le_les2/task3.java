package Java.J_le_les2;
import java.util.logging.*;
import java.io.IOException;
public class task3 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task3.class.getName());
        logger.setLevel(Level.INFO);
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        // logger.addHandler(ch);
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
 


    }
}
