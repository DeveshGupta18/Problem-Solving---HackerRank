package com.thewarlock;
import java.io.*;
import java.util.*;


public class CeasarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i);
            if(d>=97 && d<=122) {

                int a=(d+k)%122;
                if (a < 97)
                    a += 96;
                while(a>122) {
                    a=a%122;
                    if (a < 97)
                        a += 96;

                }
                str+=String.valueOf((char)a);
            }
            else if(d>=65 && d<=90) {
                int a=(d+k)%90;
                if (a < 65)
                    a += 64;
                while(a>90) {
                    a=a%90;
                    if (a < 65)
                        a += 64;

                }
                str+=String.valueOf((char)a);
            }
            else {
                str+=String.valueOf((char)d);;
            }

        }
        return str;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);
        System.out.println(result);

        scanner.close();
    }
}
