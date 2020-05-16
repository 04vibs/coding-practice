package Array;
import java.io.*;
import java.util.*;

public class rotationCountRequired {

    public static int countRotations(int arr[], int n) {
    
        // will find the index which is having minimum value
        // that index is the answer of number of rotations required
        int minIndex = -1;
        int min = arr[0];
        
        for(int i=0;i<n;i++){
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void leftRotate(int arr[], int d) {
        int n = arr.length;
        int mod = d%n;    
        for(int i=0;i<n;i++) {
            System.out.print(arr[(i+mod)%n]+ " ");
        }
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {3,4,5,7,12,1,2};
        int n = arr.length;
        System.out.println(countRotations(arr,n));
        int d = countRotations(arr,n);
        leftRotate(arr, d);
    }
}
