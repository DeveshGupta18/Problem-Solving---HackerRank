package com.thewarlock;

import java.io.IOException;
import java.util.Scanner;

public class BeautifulTriplets {

    // Complete the beautifulTriplets function below.
    static boolean binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return true;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return false;
    }

    static int beautifulTriplets(int d, int[] arr) {
        int count=0;
        for(int i=0;i<arr.length-2;i++) {
            if(binarySearch(arr, i,arr.length-1, arr[i]+d) &&
                    binarySearch(arr, i,arr.length-1, arr[i]+d+d))
                count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        System.out.println(result);
        scanner.close();
    }
}

