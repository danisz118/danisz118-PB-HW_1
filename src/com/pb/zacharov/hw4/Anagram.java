package com.pb.zacharov.hw4;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "Аз есмь строка, живу я, мерой остр.";
        String second = "За семь морей ростка я вижу рост.";
        isAnagram(first, second);
    }

    public static void isAnagram(String first, String second) {
        first = first.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        second = second.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        char[] a = first.toLowerCase().toCharArray();
        Arrays.sort(a);
        char[] b = second.toLowerCase().toCharArray();
        Arrays.sort(b);
        if (a.length != b.length) {
            System.out.println(false);
        } else if (Arrays.equals(a, b)) {
            System.out.println(true);
        }
    }
}
