package com.thewarlock;

import java.util.Arrays;

public class FlatlandSpaceStation {
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int max=c[0];
        int dis=0;
        if (n==c.length)
            return 0;
        for(int i=1;i<c.length;i++){
            dis = (c[i]-(c[i-1]))/2;
            if(dis > max)
                max=dis;
        }
        dis =(n-1)-(c[c.length-1]);
        if(dis > max)
            max=dis;
        return max;
    }

    public static void main(String[] args) {
        int c[] = {13,1,11,10,6};
        System.out.println(flatlandSpaceStations(20, c));
    }
}
