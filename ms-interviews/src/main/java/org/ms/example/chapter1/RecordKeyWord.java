package org.ms.example.chapter1;

import java.util.HashMap;
import java.util.Map;

public class RecordKeyWord {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap();

        students.put(1, "Mahesh");
        students.put(2, "Vishnu");
        students.put(3, "Naresh");
        students.put(4, "Divvesh");
        students.put(5, "Pavan");
        

        for (var student : students.entrySet()) {
            student.getValue();

        }
        for (Map.Entry<Integer, String> student : students.entrySet()) {

        }

    }

}
