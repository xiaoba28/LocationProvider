package hoowe.locationmanagerlibrary.utils;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Admin on 2017/8/29.
 */

/**
 * 时间相关常量
 */
public class TimeConstants {
    /**
     * 毫秒与毫秒的倍数
     */
    public static final int MSEC = 1;
    /**
     * 秒与毫秒的倍数
     */
    public static final int SEC = 1000;
    /**
     * 分与毫秒的倍数
     */
    public static final int MIN = 60000;
    /**
     * 时与毫秒的倍数
     */
    public static final int HOUR = 3600000;
    /**
     * 天与毫秒的倍数
     */
    public static final int DAY = 86400000;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }
}
