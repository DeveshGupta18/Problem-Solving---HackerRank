package com.thewarlock;
import java.io.*;
import java.util.*;

public class SequenceEquation {
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    static int[] permutationEquation(int[] p) {
        int result[] = new int[p.length];
        int max = Arrays.stream(p).max().getAsInt();
        for(int x=1;x<=max;x++){
            int index = search(p,x);
            int y = search(p, index+1);
            result[x-1]=y+1;
        }
        return result;
    }

    public static void main(String[] args) {
        int p[] = {2,3,1};
        int res[] =permutationEquation(p);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);

    }
}
