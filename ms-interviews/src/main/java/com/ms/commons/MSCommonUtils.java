package com.ms.commons;

public class MSCommonUtils {

    public static long printTotalTime(long startTime, long endTime, String message) {
        System.out.println("Total Time taken by " + message + " : " + (endTime - startTime));
        return ((endTime - startTime));
    }

    public static long getCurrentTime() {
        return (System.currentTimeMillis());
    }

}
