package com.pb.zacharov.hw4;

public class CapitalLetter {
    public static void main(String[] args) {
        String line = "Истина — это то, что выдерживает проверку опытом. Эйнштейн А.";
        System.out.println(makeCapitalLetter(line));
    }

    public static String makeCapitalLetter(String line) {
        StringBuilder builder = new StringBuilder(line);
        for (int i = 1; i < line.length(); i++) {
            if (Character.isAlphabetic(builder.charAt(i)) && Character.isSpaceChar(builder.charAt(i - 1))) {
                builder.setCharAt(i, Character.toUpperCase(line.charAt(i)));
            }
        }
        return builder.toString();
    }
}
