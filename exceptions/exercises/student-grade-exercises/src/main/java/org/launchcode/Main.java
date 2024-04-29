package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int division = Divide(10, 0);
        System.out.println(division);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> keyValuePair : studentFiles.entrySet()) {
            System.out.println(keyValuePair.getKey() + " got a score of " + CheckFileExtension(keyValuePair.getValue()));
        }
    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            catch (ArithmeticException e) {
                e.printStackTrace();
                return -1;
            }
        }
        else {
            return x / y;
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new IllegalArgumentException("fileName cannot be null or an empty string!");
            }
            catch (IllegalArgumentException e) {
                e.printStackTrace();
                return -1;
            }
        }

        if (fileName.endsWith(".java")) {
            return 1;
        }
        return 0;
    }
}