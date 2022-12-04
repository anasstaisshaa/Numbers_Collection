package com.JavaCore.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String user = console.nextLine();

        char[] array = user.toCharArray();
        Set<Character> result = new HashSet<>();
        for (char c : array) {
            result.add(c);
        }
        System.out.println(result);
    }
}

