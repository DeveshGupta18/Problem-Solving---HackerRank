package com.thewarlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ACMICPCTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int m = topic[0].length();
        int count=0;
        int result[] = new int[2];
        int ar[] = new int[topic.length * topic.length];
        for(int i=0,l=0;i<topic.length-1;i++){
            for(int j=i+1;j<topic.length;j++){
                count=0;
                for(int k=0;k<m;k++){
                    if(topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1'){
                        count++;
                    }
                }
                ar[l]=count;
                l++;
            }
        }
        int max = Arrays.stream(ar).max().getAsInt();
        count=0;
        for (int i=0;i<ar.length;i++){
            if(ar[i]==max)
                count++;
        }
        result[0]=max;
        result[1]=count;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

