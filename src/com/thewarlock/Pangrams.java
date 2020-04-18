package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangrams {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        boolean flag=true;
        String st=new String(s.toUpperCase());
        int a[]=new int[91];
        for(int i=0;i<st.length();i++){
            char c = st.charAt(i);
            a[c]=c;
        }
        for(int i=65;i<91;i++) {
            if(a[i]==0)
                return "not pangram";
        }

        return "pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();

        String result = pangrams(s);

        System.out.println(result);
        scanner.close();
    }
}
