package com.thewarlock;

public class JumpingOnTheClouds_Revisited {
    static int jumpingOnClouds(int[] c, int k) {
        int n=c.length;
        int i=k%n;
        int e=100;
        while(true){
            e-=1;
            if(c[i]==1)
                e-=2;
            if(i==0)
                break;
            i=(i+k)%n;
        }
        return e;
    }
    public static void main(String[] args) {
        int c[]={0,0,1,0,0,1,1,0};
        System.out.println(jumpingOnClouds(c, 2));
    }
}
