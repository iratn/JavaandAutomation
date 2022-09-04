package Steps;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private static final String SYSTEM = "config.properties";
    public static String getConfigProperty(String property){
        return getProperty(SYSTEM, property);
    }
    private static String getProperty(String resource, String property) {
        InputStream resoursePath = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream(resource);
        Properties appProps = new Properties();
        try {
            appProps.load(resoursePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appProps.getProperty(property);
    }
}