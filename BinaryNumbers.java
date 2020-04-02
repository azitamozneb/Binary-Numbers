//Given a base-10 integer,n , convert it to binary (base-2).
//Then find and print the base-10 integer denoting 
//the maximum number of consecutive 1's in n's binary representation.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int bin[]= new int [n];
         int i=0;
        while( n >0)
        {
            bin[i]= n%2;
            i++;
            n=n/2;
        }
        int k=0,max=0 ;
        for ( int j=0; j<bin.length;j++)
        {
            if ( bin[j]==1)
                k++;
            else
            {
                if ( k>max)
                max=k; 
                k=0;
            }
               
               
        }
             System.out.print(max);


        scanner.close();
    }
}
