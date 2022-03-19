package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurations {
    public String loadFile(String propety) {
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            prop.load(input);

            String getDriverFromFile = prop.getProperty(propety);
            return getDriverFromFile;

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}