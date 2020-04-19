package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    private static Properties configFile=new Properties();


        static {
            try {
                FileInputStream fileInputStream = new FileInputStream("configuration.properties");
                configFile.load(fileInputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        public static String getProperties(String key){

            return configFile.getProperty(key);
        }
    }
