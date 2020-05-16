package Array;
import java.io.*;
import java.util.*;


// visit again
// https://www.geeksforgeeks.org/maximum-number-by-concatenating-every-element-in-a-rotation-of-an-array/?ref=rp

public class maxNoByRotation {

    public static void printLargest(int a[], int n) {
    
        // store the index of largest
        // left most digit of elements
        int max = -1;
        int index = -1;
        
        // iterate for all numbers
        for(int i=0;i<n;i++) {
        int num = a[i];
        
            while(num > 0) {
            int rem = num%10;
            num = num/10;
                if(num == 0) {
            // check the largest leftmost digit
                    if(max < rem) {
                        max = rem;
                        index = i;
                    }
                }
            }
        }
        
        // print the largest number 
  
        // print the rotation of array 
        for (int i = index; i < n; i++) 
            System.out.print(a[i]); 
  
        // print the rotation of array 
        for (int i = 0; i < index; i++) 
            System.out.print(a[i]); 
    }
    
    public static void main(String args[]) {
        // TODO code application logic here        
        int a[] = { 54, 546, 548, 60 }; 
        int n = a.length; 
        printLargest(a, n); 
    }
}
