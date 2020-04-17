package com.estore.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * @program: Hern-Estore
 * @description: DateTimeUtil
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-04-08 22:58
 **/
public class DateTimeUtil {

    //joda-time
    //指定时间格式
    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    //String型时间转换成Date型，指定时间格式
    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    //Date型时间转换成String型，指定时间格式
    public static String dateToStr(Date date,String formatStr){
        //提示时间值为空
        if(date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    //String型时间转换成Date型
    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    //Date型时间转换成String型
    public static String dateToStr(Date date){
        if(date == null){
            return StringUtils.EMPTY;
        }

        DateTime dateTime = new DateTime(date);

        return dateTime.toString(STANDARD_FORMAT);
    }

}
