package com.shazzar.leetcode.letcode;

import java.util.ArrayList;
import java.util.List;

public class FirstLetterToAppearTwice {

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("ncwn"));
    }

    public static char repeatedCharacter(String s) {
        List<Character> characters = new ArrayList<>();
        char letterS = 0;
        for (char letter : s.toCharArray()) {
            if (characters.contains(letter)) {
                characters.add(letter);
                letterS = letter;
                break;
            } else {
                characters.add(letter);
            }
        }
        return letterS;
    }
}
