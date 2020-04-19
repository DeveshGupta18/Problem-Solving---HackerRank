package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankInAString {

    // Complete the hackerrankInString function below.

    static int search(String s, char c, int index) {
        for(int i=index;i<s.length();i++) {
            if(s.charAt(i)==c)
                return i;
        }
        return -2;
    }

    static String hackerrankInString(String s) {
        String str = new String("hackerrank");
        int index=0;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(index>=0)
                index = search(s, c, index)+1;
            else
                return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
            System.out.println(result);

        }



        scanner.close();
    }
}