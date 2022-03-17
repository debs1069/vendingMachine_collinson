package Util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Base_test {
    public static Properties confProp;
      static String sPropertiesFiles="./src/test/resources/config/Input.properties";
    //static String sPropertiesFiles = "./src/test/resources/config/Input.properties";

    public static String getGlobalValue(String key) throws Exception {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(sPropertiesFiles);

        prop.load(input);
        return prop.getProperty(key);
    }

    // Read all the properties from config file

}
