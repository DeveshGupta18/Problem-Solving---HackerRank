package com.thewarlock;

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count=0;
        int sum=p;
        while(sum<=s){
                p-=d;
            if (p>m){
                sum+=p;
            }
            else
                sum+=m;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(16, 2,1,9981));
    }
}
