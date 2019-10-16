package com.example.comsystem.util;

public class StringUtil {

    public static String[] analysisArrayStr(String str) {
        String[] strs = new String[0];
        if (str == "" || str == null || str.equals("[]")) {
            return strs;
        }
        String a = str.substring(1, str.length() - 1);
        String[] stras = a.split(",");
        return stras;
    }
}
