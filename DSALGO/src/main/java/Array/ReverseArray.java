/*
left rotation
Reversal algorithm for array rotation
Write a function rotate(arr[], d, n) that rotates 
arr[] of size n by d elements.
Example :
Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
A = [1, 2] and B = [3, 4, 5, 6, 7]

Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
*/
package Array;
import java.util.*;

public class ReverseArray {

    public static void leftRotate(int arr[], int d){
        if(d==0){
        return;
        }
        int n = arr.length;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);        
    }
    public static void reverseArray(int arr[],int start, int end){
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {1,2,3,4,5,6,7};
        int n= arr.length;
        int d = 2;
        
        // incase the rotating factor is 
        // greater than array length
        
        d = d%n;
        leftRotate(arr,d);
        printArray(arr);
    }
}
