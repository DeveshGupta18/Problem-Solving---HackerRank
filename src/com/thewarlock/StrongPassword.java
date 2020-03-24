package com.thewarlock;
import java.io.*;
import java.util.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int l=n;
        int d=0;
        int lc=0;
        int uc=0;
        int sc=0;

        for(int i=0;i<n;i++){
            char c =password.charAt(i);
            if(c>=65 && c <=90)
                uc++;
            else if(c>=97 && c<=122)
                lc++;
            else if(c>=48 && c<=57)
                d++;
            else /*if(c == '!' ||c == '@' ||c == '#' ||c == '$' ||c == '%' ||
                    c == '^' ||c == '&' ||c == '*' ||c == '(' ||c == ')' ||
                    c == '-' ||c == '+' )*/
                sc++;
        }
        int count=0;
        if(d==0)
            count++;
        if(uc==0)
            count++;
        if(sc==0)
            count++;
        if(lc==0)
            count++;
        int sum=count+l;
        if(sum<6)
            return 6-l;
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        System.out.println(answer);
        scanner.close();
    }
}



