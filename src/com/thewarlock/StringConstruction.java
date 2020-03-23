package com.thewarlock;
import java.io.*;
import java.util.*;

public class StringConstruction {
    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int count=0;
        int cost=0;
        for(int i=0;i<s.length();i++) {
            if(!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), count++);
                cost++;
            }
        }
        return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);
            System.out.println(result);
        }
        scanner.close();
    }
}

