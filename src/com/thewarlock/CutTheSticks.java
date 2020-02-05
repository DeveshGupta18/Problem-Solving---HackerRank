package com.thewarlock;

import java.util.Arrays;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        /*StringBuffer str= new StringBuffer("");
        Arrays.sort(arr);
        int size=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1])
                size++;
        }
        int ar[] = new int[size];
        ar[0]=arr.length;
        for(int i=0;i<arr.length;i++)
            str.append(arr[i]);
        System.out.println(str);
        return arr;*/
        Arrays.sort(arr);
        int size = 1;
        int max = Arrays.stream(arr).max().getAsInt();
        int ar[] = new int[max + 1];
        int count = 0, sum = 0;
        for (int i = 0; i < arr.length; i++)
            ar[arr[i]]++;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0)
                count++;
            sum += ar[i];
        }

        int result[] = new int[count];
        result[0] = sum;
        int j=1;
        for (int i = 1; i < ar.length-1; i++) {
            if (ar[i] != 0) {
                sum -= ar[i];
                result[j] = sum;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 4, 2, 2, 8};
        int ar[] = cutTheSticks(arr);
        for (int i = 0; i < ar.length; i++)
            System.out.println(ar[i]);
    }
}
