package com.thewarlock;

import java.util.Arrays;

public class MinimumDistances {
    static int contains(int []a, int key, int ind){
        for(int i=ind;i<a.length;i++){
            if(a[i]==key)
                return i;
        }
        return -1;
    }
    static int minimumDistances(int[] a) {
        int min = Arrays.stream(a).max().getAsInt();
        int dis=0;
        boolean flag=false;
        for (int i=0;i<a.length-1;i++){
            int index = contains(a, a[i], i+1);
            if(index!=-1) {
                dis = Math.abs(i - index);
                if(min > dis)
                    min = dis;
                    flag=true;
            }
        }
        if (!flag)
            return -1;
        return min;
    }

    public static void main(String[] args) {
        int []a= {1,2,3,4,10};
        System.out.println(minimumDistances(a));
    }
}
