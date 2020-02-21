package com.thewarlock;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count=0;
        boolean aflag=false;
        boolean bflag=false;
        for(int i=a.get(a.size()-1);i<=b.get(0);i++){
            for(int j=0;j<a.size();j++){
                if(i%a.get(j)==0)
                    aflag=true;
                else{
                    aflag=false;
                    break;
                }
            }
            if(aflag){
                for(int k=0;k<b.size();k++){
                    if(b.get(k)%i==0)
                        bflag=true;
                    else{
                        bflag=false;
                        break;
                    }
                }
                if(bflag)
                    count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(6);
        b.add(24);
        b.add(36);

        System.out.println(getTotalX(a, b));
    }
}
