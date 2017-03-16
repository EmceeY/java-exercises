package org.launchcode.java.demos.studio;

import java.util.HashMap;

import java.util.Scanner;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Map;

/**
 * Created by User on 3/2/17.
 */
public class CharacterCount {

    public static void main (String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        //User input that is counted
        //Scanner in = new Scanner(System.in);
        /**
         * Implemented a way that a text file that can be put in.
         */
        try {
        File file = new File("alice.txt");
        Scanner in = new Scanner(file);
            // System.out.println("Enter in a phrase that you would like characters counted for: ");
            //read in a users' input
            //String text = in.nextLine();
            String text = in.nextLine();
            text = text.toLowerCase().replaceAll("[^a-z]", "");
            for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                if (charCount.containsKey(character)) {
                    int x = charCount.get(character);
                    x = x + 1;
                    charCount.put(character, x);
                } else {
                    charCount.put(character, 1);
                }

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();}

        //prints out " char : value "
        for (Map.Entry<Character, Integer> count : charCount.entrySet()){
            System.out.println(count.getKey() + " : " + count.getValue());
        }
            //old count method that wasn't working well
            System.out.println(charCount);
    }
}
