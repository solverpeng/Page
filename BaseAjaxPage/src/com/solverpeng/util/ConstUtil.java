package com.solverpeng.util;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/22
 *      desc  : 常量工具类
 * </pre>
 */
public abstract class ConstUtil {
    /******************** 存储相关常量 ********************/
    /**
     * KB与Byte的倍数
     */
    public static final int KB = 1024;
    /**
     * MB与Byte的倍数
     */
    public static final int MB = 1048576;
    /**
     * GB与Byte的倍数
     */
    public static final int GB = 1073741824;

    public enum MemoryUnit {
        BYTE,
        KB,
        MB,
        GB
    }

    /******************** 时间相关常量 ********************/
    /**
     * 秒与毫秒的倍数
     */
    public static final int SEC  = 1000;
    /**
     * 分与毫秒的倍数
     */
    public static final int MIN  = 60000;
    /**
     * 时与毫秒的倍数
     */
    public static final int HOUR = 3600000;
    /**
     * 天与毫秒的倍数
     */
    public static final int DAY  = 86400000;

    public enum TimeUnit {
        MSEC,
        SEC,
        MIN,
        HOUR,
        DAY
    }

    /******************** 日期相关常量 ********************/
    /**
     * 年
     */
    public static final String DATE_PATTERN_YEAR = "yyyy";
    /**
     * 月
     */
    public static final String DATE_PATTERN_MONTH = "MM";
    /**
     * 日
     */
    public static final String DATE_PATTERN_DAY = "dd";
    /**
     * 星期
     */
    public static final String DATE_PATTERN_WEEK = "E";
    /**
     * 年月日
     */
    public static final String DATE_PATTERN_YYYYMMDD = "yyyyMMdd";
    /**
     * 年-月-日
     */
    public static final String DATE_PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
    /**
     * 时：分：秒
     */
    public static final String DATE_PATTERN_HH_MM_SS = "HH:mm:ss";
    /**
     * 1970年01月01日
     */
    public static final String DATE_PATTERN_YYYY_YEAR_MM_MONTH_DD_DAY = "yyyy年MM月dd日";
    /**
     * 年-月-日 时：分
     */
    public static final String DATE_PATTERN_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    /**
     * 年-月-日 时：分：秒
     */
    public static final String DATE_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /******************** 正则相关常量 ********************/
    /**
     * 正则：手机号（简单）
     */
    public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";
    /**
     * 正则：手机号（精确）
     * <p>移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188</p>
     * <p>联通：130、131、132、145、155、156、175、176、185、186</p>
     * <p>电信：133、153、173、177、180、181、189</p>
     * <p>全球星：1349</p>
     * <p>虚拟运营商：170</p>
     */
    public static final String REGEX_MOBILE_EXACT  = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";
    /**
     * 正则：电话号码
     */
    public static final String REGEX_TEL           = "^0\\d{2,3}[- ]?\\d{7,8}";
    /**
     * 正则：身份证号码15位
     */
    public static final String REGEX_ID_CARD15     = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";
    /**
     * 正则：身份证号码18位
     */
    public static final String REGEX_ID_CARD18     = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$";
    /**
     * 正则：邮箱
     */
    public static final String REGEX_EMAIL         = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    /**
     * 正则：URL
     */
    public static final String REGEX_URL           = "[a-zA-z]+://[^\\s]*";
    /**
     * 正则：汉字
     */
    public static final String REGEX_ZH            = "^[\\u4e00-\\u9fa5]+$";
    /**
     * 正则：用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
     */
    public static final String REGEX_USERNAME      = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$";
    /**
     * 正则：yyyy-MM-dd格式的日期校验，已考虑平闰年
     */
    public static final String REGEX_DATE          = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";
    /**
     * 正则：IP地址
     */
    public static final String REGEX_IP            = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

    /**
     * 正则：双字节字符(包括汉字在内)
     */
    public static final String REGEX_DOUBLE_BYTE_CHAR     = "[^\\x00-\\xff]";
    /**
     * 正则：空白行
     */
    public static final String REGEX_BLANK_LINE           = "\\n\\s*\\r";
    /**
     * 正则：QQ号
     */
    public static final String REGEX_TENCENT_NUM          = "[1-9][0-9]{4,}";
    /**
     * 正则：中国邮政编码
     */
    public static final String REGEX_ZIP_CODE             = "[1-9]\\d{5}(?!\\d)";
    /**
     * 正则：正整数
     */
    public static final String REGEX_POSITIVE_INTEGER     = "^[1-9]\\d*$";
    /**
     * 正则：负整数
     */
    public static final String REGEX_NEGATIVE_INTEGER     = "^-[1-9]\\d*$";
    /**
     * 正则：整数
     */
    public static final String REGEX_INTEGER              = "^-?[1-9]\\d*$";
    /**
     * 正则：非负整数(正整数 + 0)
     */
    public static final String REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";
    /**
     * 正则：非正整数（负整数 + 0）
     */
    public static final String REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";
    /**
     * 正则：正浮点数
     */
    public static final String REGEX_POSITIVE_FLOAT       = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";
    /**
     * 正则：负浮点数
     */
    public static final String REGEX_NEGATIVE_FLOAT       = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$";

    /**
     * 正则：script
     */
    public static final String REGEX_SCRIPT = "<script[^>]*?>[\\s\\S]*?<\\/script>";
    /**
     * 正则：style
     */
    public static final String REGEX_STYLE = "<style[^>]*?>[\\s\\S]*?<\\/style>";
    /**
     * 正则：html
     */
    public static final String REGEX_HTML = "<[^>]+>"; // 定义HTML标签的正则表达式

    /******************** 编码解码相关常量 ********************/
    /**
     * 默认字符集：UTF-8
     */
    public static final String DEFAULT_URL_ENCODING = "UTF-8";
    /**
     * Base62编码解码字符
     */
    public static final char[] BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    /******************** 数学运算相关常量 ********************/
    /**
     * 默认除法运算精度
     */
    public static final int DEF_DIV_SCALE = 10;

}
