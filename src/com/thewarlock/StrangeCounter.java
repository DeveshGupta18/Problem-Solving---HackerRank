package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrangeCounter {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        long pt=1, pv=3;
        long nt = pt+pv, nv=pv*2;
        while(t>nt){
            pt=nt;
            pv=nv;
            nt=pt+pv;
            nv=pv*2;
        }
        long ndis=nt-t;
        if(ndis==0)
            return nv;
        long pdis = t-pt;
        return pv-pdis;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(15));
    }
}

