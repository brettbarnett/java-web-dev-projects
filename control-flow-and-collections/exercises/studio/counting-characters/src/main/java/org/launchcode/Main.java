package org.launchcode;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String quote = ReadStringFromFile("src/main/java/org/launchcode/Quote.txt");
        char[] charArray = quote.toCharArray();

        HashMap<Character, Integer> Counts = new HashMap<>();

        for (char letter : charArray) {
            //Skip spaces
            if (!Character.isAlphabetic(letter)) {
                continue;
            }

            Character uppercaseLetter = Character.toUpperCase(letter);
            if (Counts.containsKey(uppercaseLetter)) {
                Counts.put(uppercaseLetter, Counts.get(uppercaseLetter) + 1);
            }
            else {
                Counts.put(uppercaseLetter, 1);
            }
        }

        for (Map.Entry<Character, Integer> keyValuePair : Counts.entrySet()) {
            System.out.println("Character: " + keyValuePair.getKey() + " Total Count: " + keyValuePair.getValue());
        }


    }

    private static String ReadStringFromFile(String filePath) {
        String quote;

        try {
            quote = Files.readString(Path.of(filePath));
        }
        catch(Exception ex) {
            quote = "";
        }

        return quote;
    }
}