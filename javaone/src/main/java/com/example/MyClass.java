package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

    public static void main(String[] args) {
        String str = "朗读韵文\nI met a snake.\nNear the lake.\nHe ate the cake.\nMade his stomach ache.";
        System.out.println(noChinsesText(str));

    }

    public static String noChinsesText(String text) {
        String reg = "[\u4e00-\u9fa5]";

        Pattern pat = Pattern.compile(reg);

        Matcher mat = pat.matcher(text);

        String repickStr = mat.replaceAll("");
        return repickStr;
    }


}
