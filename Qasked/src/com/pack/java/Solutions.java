package com.pack.java;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solutions {
    public int solution(int[] A) {
        // write your code in Java SE 8
  int x=-1;
   //take the entire array
   for(int i=0; i<A.length;i++)
   { 
   int sum=0;
       //uppper sum
       for(int j=0+i+1;j<A.length-i; j++){
           sum+=A[j];
       }
       int sumlower=0;
        for(int k=0;k<i; k++){
           sumlower+=A[k];
       }
       if(sum==sumlower)  x= i;
    }
    return x;
    }
}