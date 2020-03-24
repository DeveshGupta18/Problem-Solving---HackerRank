package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class IntoToTutorialChallenges {
    static int bS(int v, int []arr, int l, int r){
        int mid=(l+r)/2;
        while(l<=r){
            if(arr[mid]==v)
                return mid;
            else if(v>arr[mid])
                return bS(v, arr, mid+1, r);
            else
                return bS(v, arr, 0, mid-1);
        }
        return -1;
    }

    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
        return bS(V, arr, 0, arr.length-1);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int V = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = introTutorial(V, arr);

        System.out.println(result);
        scanner.close();
    }
}

