package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try(FileInputStream fileInputStream = new FileInputStream("config.properties")){
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to load the configuration.properties file.");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
    public static void setProperty(String key, String value){
        properties.setProperty(key,value);
    }
}
