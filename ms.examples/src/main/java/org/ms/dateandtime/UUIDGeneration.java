package org.ms.dateandtime;

import java.util.UUID;

public class UUIDGeneration {

    public void getUniqueNumber() {
        long startTime = 0, endTime = 0, totalTime = 0;
        startTime = System.currentTimeMillis();
//        String uuidNumber = UUID.randomUUID().toString();
        StringBuilder uuidNumber = new StringBuilder(UUID.randomUUID().toString());
//        "7c5d8b54-4bcd-461c-834c-8d9a694aabcf"
        uuidNumber.replace(8, 9, "").replace(12, 13, "")
                .replace(16, 17, "").replace(20, 21, "");

        endTime = System.currentTimeMillis();

        System.out.println("Generated Number : " + uuidNumber + " Total time : " + (endTime - startTime));

    }

    public static void main(String[] args) {

        UUIDGeneration uuidGeneration = new UUIDGeneration();

        for (int i = 0; i < 100; i++) {
            uuidGeneration.getUniqueNumber();
        }
    }

}
