package com.n8ify.plantman.util;


import com.n8ify.plantman.constant.CommonConstant;

public class DateUtil {

    public static String prettyTime(Long milliseconds) {
        long millisecondUsage = milliseconds % 1000;
        long secondUsage = (milliseconds / 1000) % 60;
        long minuteUsage = (milliseconds / (1000 * 60));
        return String.format(
                minuteUsage > 0 ? String.format("%d minute(s)", minuteUsage) : CommonConstant.EMPTY,
                secondUsage > 0 ? String.format("%d second(s)", secondUsage) : CommonConstant.EMPTY,
                minuteUsage > 0 ? String.format("%d millisecond(s)", millisecondUsage) : CommonConstant.EMPTY
        );
    }

}
