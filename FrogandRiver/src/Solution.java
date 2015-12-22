/*A small frog wants to get to the other side of a river. The frog is currently located at position 0, and wants to get to position X. Leaves fall from a tree onto the surface of the river.

You are given a non-empty zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X. You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

int solution(int X, int A[], int N);

that, given a non-empty zero-indexed array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return -1.

For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.

Assume that:

N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(X), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.*/
import java.util.Arrays;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A, int X, int D) {
     // write your code in Java SE 8
 //initializing the jumps
 int jumps=-1;
 int temp=0;
  int temp2=0;
 int ab=0;
 int    temp3=0;
 //boundary condition
 if(X>D && A.length==0)
 {return jumps; 
 }

 //if the jumps distance is greater than destination
 //he can directly jumps so jumps =0
 else if(X<D){
  jumps=0;
  return  jumps;  
     
 }
 //the leaves distance is the only way he can get to other side
 //test case1:   ([1, 3, 1, 4, 2, 5], 7, 3) he reaches when i=3
 //test case2: ([0,0,1],7,3),  ([0,5,1],7,3): he doesnt reach -1
 //test case3: ([1, 3, 1, 5, 2, 4], 7, 3) he reaches when i=3 within the jump span of 3 

 else {
     //jumps the frog can make
      temp= X-D;
     
     for(int i=0;i<A.length;i++){
        
       //worst case can make jumps to X-D
       //here we see to it that the frog makes progressivejumps
       //
        if(A[i]>ab && A[i]-ab<=D )
        {
           ab=A[i];
       
       temp3= temp+ab;
        if(temp3>X)
        return i;
        
        }
       
       
     }
     
     
   return jumps;  
 }
 
 
 }
}