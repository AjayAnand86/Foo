package com.test;

import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass {
    public static void main(String args[] ) throws Exception {
    	 Scanner s = new Scanner(System.in);
         int n = s.nextInt();    
         int [][] arr=new int[n][2];
         for(int i=0;i<n;i++){
             int x = s.nextInt();
             int y = s.nextInt();
             arr[i][0]=x;
             arr[i][1]=y;
         }
         double lenght=0.0;
         for(int i=0;i<n;i++){
        	 for(int j=i+1;j<i+2;j++){
        		 
        		 lenght=lenght + Math.sqrt((arr[j][0]-arr[i][0])*(arr[j][0]-arr[i][0]) + (arr[j][1]-arr[i][1])*(arr[j][1]-arr[i][1]));
             }
         }
            System.out.println(lenght); 
             
        }
	

    }

