package Array;
import java.util.*;
import java.io.*;

public class multipleLeftRotations {
    
    public static void leftRotate(int arr[], int n, int d){
        int mod = d%n;
        for(int i=0; i < n;i++) {
            System.out.print(arr[(i+mod)%n] + " ");
        }
        System.out.println(" "); 
    }
    
    public static void main(String args[]) {
        // TODO code application logic here    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of testcases you want to run");
        int testcases = input.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        while(testcases != 0) {
            System.out.println("Enter the rotation (i.e value of d) you want to perform");
            int d = input.nextInt();
            leftRotate(arr,n,d);
            testcases--;
        }
    }
}
