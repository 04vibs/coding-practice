
package Array;
import java.util.*;

public class rightRotation {

    public static void reverseArray(int arr[], int start, int end) {
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void rightRotate(int arr[], int d) {
    if(d==0){
    }
            int n= arr.length;
            reverseArray(arr,0, n-1);
            reverseArray(arr,0,d-1);
            reverseArray(arr,d,n-1);
    }
    public static void printArray(int arr[]) {
        int i=0;
        int n= arr.length;
        
        for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
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
        rightRotate(arr,d);
        printArray(arr);
    }
}
