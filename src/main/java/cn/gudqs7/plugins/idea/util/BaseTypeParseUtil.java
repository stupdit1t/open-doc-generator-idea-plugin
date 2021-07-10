package cn.gudqs7.plugins.idea.util;

/**
 * @author wq
 */
public class BaseTypeParseUtil {


    public static boolean parseBoolean(String value, boolean defaultVal) {
        try {
            return Boolean.parseBoolean(value);
        } catch (Exception ingored) {
        }
        return defaultVal;
    }

}
