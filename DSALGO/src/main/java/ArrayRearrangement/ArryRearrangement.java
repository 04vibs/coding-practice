/* Rearrange an array such that arr[i] = i

Given an array of elements of length N,
ranging from 0 to N – 1. All elements may not be 
present in the array. If element is not present 
then there will be -1 present in the array. Rearrange the array 
such that A[i] = i and if i is not present, display -1 at that place.


Approach:
1. Nav­i­gate the array.
2. Check if a[i] = -1, if yes then ignore it.
3. If a[i] != -1, Check if element a[i] is at its cor­rect posi­tion (i=A[i]). If yes then ignore it.
4. If a[i] != -1 and ele­ment a[i] is not at its cor­rect posi­tion (i!=A[i]) then place it to its correct posi­tion, but there are two conditions:

Either A[i] is vacate, means A[i] = -1, then just put A[i] = i .
OR A[i] is not vacate, means A[i] = x, then int y=x put A[i] = i. Now, we need to place y to its cor­rect place, so repeat from step 3.
*/


package ArrayRearrangement;

import java.io.*;
import java.util.*;

public class ArryRearrangement {
    
     // Function to rearrange an array 
    // such that arr[i] = i. 
    public static int[] fix(int[] A) 
    { 
        for (int i = 0; i < A.length; i++)  
        { 
            if (A[i] != -1 && A[i] != i) 
            { 
                int x = A[i]; 
  
                // check if desired place 
                // is not vacate 
                while (A[x] != -1 && A[x] != x)  
                { 
  
                    // store the value from 
                    // desired place 
                    int y = A[x]; 
  
                    // place the x to its correct 
                    // position 
                    A[x] = x; 
  
                    // now y will become x, now 
                    // search the place for x 
                    x = y; 
                } 
  
                // place the x to its correct 
                // position 
                A[x] = x; 
  
                // check if while loop hasn't  
                // set the correct value at A[i] 
                if (A[i] != i) 
                { 
  
                    // if not then put -1 at 
                    // the vacated place 
                    A[i] = -1; 
                } 
            } 
        } 
        return A; 
    }

    public static void main(String args[]) {
        // TODO code application logic here
        
        int arr[] = {-1,-1,6,1,9,3,2,-1,4,-1,5};
        System.out.println(Arrays.toString(fix(arr)));
        
    }
}
