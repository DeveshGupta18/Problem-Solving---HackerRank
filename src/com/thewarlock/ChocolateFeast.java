package com.thewarlock;

public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        int w = n / c;
        int t = w;
        while (w >= m) {
            t += w/m;
            w = w/m + w%m;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(6, 2, 2));
    }
}
