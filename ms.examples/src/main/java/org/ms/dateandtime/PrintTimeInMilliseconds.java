package org.ms.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class PrintTimeInMilliseconds {


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        long startTime = System.currentTimeMillis();
        System.out.println("Start Time : " + startTime);
        String uuidNumber = UUID.randomUUID().toString();
        long endTime = System.currentTimeMillis();
        System.out.println("End Time : " + endTime);
        System.out.println("Total time taken " + (endTime - startTime));
        System.out.println(uuidNumber);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);

        String date = now.toString()
                .replaceAll("-", "").replaceAll("T", "").replaceAll(":", "");
        System.out.println("After replaceing special characters: " + date);


        // 2023-01-12T19:53:40.205231900

    }

}
