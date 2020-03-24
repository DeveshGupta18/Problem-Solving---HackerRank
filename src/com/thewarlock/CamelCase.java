package com.thewarlock;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int count=1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();

        int result = camelcase(s);

        System.out.println(result);

        scanner.close();
    }
}


