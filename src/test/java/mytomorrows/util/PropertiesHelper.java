package mytomorrows.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHelper {

    public static String getHomePageURL() {
        return getProperty("home_page_url");
    }

    public static String getUserName() {
        return getProperty("user_name");
    }

    public static String getEmailDomain() {
        return getProperty("email_domain");
    }

    private static String getProperty(String propertyName) {
        Properties prop = new Properties();
        ClassLoader classLoader = PropertiesHelper.class.getClassLoader();
        try (InputStream stream = classLoader.getResourceAsStream("mytomorrows.properties")) {
            prop.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
            //TODO check if this is the best
        }
        return prop.getProperty(propertyName);
    }

}
