package Array;
import java.util.*;
import java.io.*;

public class cylindricalRotation {

    public static void rotateCylindrical(int arr[]){
        int n = arr.length;
        int x = arr[n-1];
        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }
    
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }   
    
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        
        rotateCylindrical(arr);    
        printArray(arr);
    }
}
