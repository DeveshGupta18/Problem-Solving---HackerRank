package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ServiceLane {

    // Complete the serviceLane function below.
    static int[] serviceLane(int n, int t, int width[], int[][] cases) {
        int result[]= new int[t];
        for(int i=0;i<t;i++){
            ArrayList<Integer> al = new ArrayList<>();
            int a = cases[i][0];
            int b= cases[i][1];
            for(int j=a;j<=b;j++)
                al.add(width[j]);
            result[i]=Collections.min(al);
        }
        return result;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n,t, width,cases);

        for(int a: result)
            System.out.println(a);

        scanner.close();
    }
}
