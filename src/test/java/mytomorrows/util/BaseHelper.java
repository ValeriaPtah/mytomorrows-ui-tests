package mytomorrows.util;

import org.apache.commons.lang3.RandomStringUtils;

import static mytomorrows.util.PropertiesHelper.getEmailDomain;
import static mytomorrows.util.PropertiesHelper.getUserName;

public class BaseHelper {

    public static String getUserEmail() {
        return getUserName() + "+" + RandomStringUtils.randomNumeric(10, 1000) + getEmailDomain();
    }
}
