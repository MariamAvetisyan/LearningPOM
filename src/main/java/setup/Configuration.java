package setup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static objects.constants.Constants.PROPERTY_FILE_PATH;

public class Configuration {
    private Properties properties;
    public static String DEMO_QA_BOOKS;
    public static String USERNAME ;
    public static String PASSWORD;

    public Configuration() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(PROPERTY_FILE_PATH));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + PROPERTY_FILE_PATH);
        }
        DEMO_QA_BOOKS =  properties.getProperty("URL");
        USERNAME = properties.getProperty("userName");
        PASSWORD = properties.getProperty("password");
    }
}