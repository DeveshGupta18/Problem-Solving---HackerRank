package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if(s.length()==1){
            if(s.charAt(0)=='a')
                return n;
            else
                return 0;
        }
        long t =n%s.length();
        long count=0;
        long counting=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
                if(i<t)
                    counting++;
            }
        }
        long counter=count+counting;
        counter+=count*(n/s.length() - 1);
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
