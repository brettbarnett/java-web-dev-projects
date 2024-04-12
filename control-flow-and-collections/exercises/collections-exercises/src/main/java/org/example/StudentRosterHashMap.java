package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRosterHashMap {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String input;

        HashMap<Integer, String> studentHashMap = new HashMap<>();

        do {
            System.out.println("Enter student name: ");

            //input = inputReader.next();
            input = inputReader.nextLine();
            String studentName = input;

            if (!studentName.isEmpty()) {
                System.out.println("Enter student id for " + input + ": ");
                input = inputReader.nextLine();
                Integer studentId = Integer.parseInt(input);

                studentHashMap.put(studentId, studentName);
            }
        }
        while(!input.isEmpty());

        for (Map.Entry<Integer, String> keyValuePair : studentHashMap.entrySet()) {
            System.out.println(keyValuePair.getKey() + " : " + keyValuePair.getValue());
        }
    }
}