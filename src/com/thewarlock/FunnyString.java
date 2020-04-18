package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        String r=new String(sb.reverse().toString());

        int sa[] = new int[s.length()];
        int ra[] = new int[s.length()];

        for(int i=0;i<s.length();i++) {
            sa[i]=s.charAt(i);
            ra[i]=r.charAt(i);
        }

        int a[] = new int[sa.length];
        int b[] = new int[ra.length];

        for(int i=1;i<sa.length;i++) {
            a[i]=Math.abs(sa[i]-sa[i-1]);
            b[i]=Math.abs(ra[i]-ra[i-1]);
        }



        for(int i=1;i<sa.length;i++) {
            if(a[i]!=b[i])
                return "Not Funny";
        }
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            System.out.println(result);
        }



        scanner.close();
    }
}
