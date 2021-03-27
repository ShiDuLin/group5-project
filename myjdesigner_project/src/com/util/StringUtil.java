package com.util;

/**
 * ClassName StringUtil
 * <br>描述 字符串处理工具类
 * @author 阿木木
 * @date 2021/3/27 11:01
 * Version 1.0
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        } else {
            return false;
        }
    }
}
