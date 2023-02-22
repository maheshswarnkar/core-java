package org.ms.dateandtime;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class UniqeNumberFromDateTime {

//    private static void generateUniqueNumber() {
    private static void generateUniqueNumberFromTime() {

        long startTime, endTime = 0;
        startTime = System.currentTimeMillis();
//        System.out.println("Start Time : " + startTime);

        LocalDateTime now = LocalDateTime.now();
        // Dont use Random class because there is probability that it would generate
        // same number.
        // So, please use SecureRandom class which is designed to generate
        // cryptographically new number only.
        SecureRandom secureRandom = new SecureRandom();
		int randomNumber = secureRandom.nextInt(900) + 100; // generates random no. between 10 and 100
//        System.out.println("Random number : " + randomNumber);

        StringBuilder sb = new StringBuilder();
        sb = sb.append(now.toString()).replace(4, 5, "").replace(6, 7, "").replace(8, 9, "").replace(10, 11, "")
                .replace(12, 13, "")
                .replace(14, 15, "").append(randomNumber);

//        sb = sb.append("20230113083553282779688");
//        sb = sb.append("20230113083553282779688000123");
        if (sb.length() != 26) {
            // Below condition is required because some times length of time is less then 26
            // chars.
            if (sb.length() < 26) {
                while (sb.length() < 26) {
                    sb.append("0");
                }
            }
            // Below condition is a precautionary step for different-different Operating
            // Systems.
            if (sb.length() > 26) {
                while (sb.length() > 26) {
                    sb.deleteCharAt(26);
                }
            }
        }

        endTime = System.currentTimeMillis();
//        System.out.println("End time : " + endTime);
        long totalTime = (endTime - startTime);
//        System.out.println("Time taken " + totalTime);
        System.out.println("Generated Unique Number from DateTime : " + sb + " Time taken " + totalTime);
    }

    public static void getUniqueNumberFromUUID() {
        long startTime = 0, endTime = 0, totalTime = 0;
        startTime = System.currentTimeMillis();
//        String uuidNumber = UUID.randomUUID().toString();
        StringBuilder uuidNumber = new StringBuilder(UUID.randomUUID().toString());
//        "7c5d8b54-4bcd-461c-834c-8d9a694aabcf"
        uuidNumber.replace(8, 9, "").replace(12, 13, "")
                .replace(16, 17, "").replace(20, 21, "");

        endTime = System.currentTimeMillis();

        System.out.println(
                "Generated unique number from UUID : " + uuidNumber + " Total time : " + (endTime - startTime));

    }

    public static void main(String[] args) {

        UniqeNumberFromDateTime uniqeNumberFromDateTime = new UniqeNumberFromDateTime();

        long startTime, endTime = 0;
        startTime = System.currentTimeMillis();

        // static method execution gives good performance then instance method execution
        // some times, not always.
        for (int i = 0; i < 5; i++) {
//            System.out.println("Iteration Number : " + i);
            uniqeNumberFromDateTime.generateUniqueNumberFromTime();
            uniqeNumberFromDateTime.getUniqueNumberFromUUID();
//            uniqeNumberFromDateTime.generateUniqueNumberFromTime();
//            generateUniqueNumber();
        }

        endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime);
        System.out.println("Total time to execute all : " + totalTime);

    }
}
