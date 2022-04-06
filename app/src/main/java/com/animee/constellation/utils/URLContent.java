package com.animee.constellation.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLContent {

//     match constellation interface
    public static String getParnterURL(String men,String woman){
        switch (men){
            case "Aries":
                men = "白羊座";
                break;
            case "Taurus":
                men = "金牛座";
                break;
            case "Gemini":
                men = "双子座";
                break;
            case "Cancer":
                men = "巨蟹座";
                break;
            case "Leo":
                men = "狮子座";
                break;
            case "Virgo":
                men = "处女座";
                break;
            case "Libra":
                men = "天秤座";
                break;
            case "Scorpio":
                men = "天蝎座";
                break;
            case "Sagittarius":
                men = "射手座";
                break;
            case "Capricorn":
                men = "摩羯座";
                break;
            case "Aquarius":
                men = "水瓶座";
                break;
            case "Pisces":
                men = "双鱼座";
                break;
            default:break;
        }
        switch (woman){
            case "Aries":
                woman = "白羊座";
                break;
            case "Taurus":
                woman = "金牛座";
                break;
            case "Gemini":
                woman = "双子座";
                break;
            case "Cancer":
                woman = "巨蟹座";
                break;
            case "Leo":
                woman = "狮子座";
                break;
            case "Virgo":
                woman = "处女座";
                break;
            case "Libra":
                woman = "天秤座";
                break;
            case "Scorpio":
                woman = "天蝎座";
                break;
            case "Sagittarius":
                woman = "射手座";
                break;
            case "Capricorn":
                woman = "摩羯座";
                break;
            case "Aquarius":
                woman = "水瓶座";
                break;
            case "Pisces":
                woman = "双鱼座";
                break;
            default:break;
        }
        men = men.replace("座","");
        woman = woman.replace("座","");
        try {
            men = URLEncoder.encode(men,"UTF-8");
            woman = URLEncoder.encode(woman,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = "http://apis.juhe.cn/xzpd/query?men="+men+"&women="+woman+"&key=aab7f23b9a6149ef03e1b8136e38b640";
        return url;
    }

//    constellation lucky interface
    public static String getLuckURL(String name){
        try {
            name = URLEncoder.encode(name,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String url = "http://web.juhe.cn:8080/constellation/getAll?consName="+name+"&type=year&key=37654c72ae968cedc1f7f173181eb019";
        return url;

    }
}
