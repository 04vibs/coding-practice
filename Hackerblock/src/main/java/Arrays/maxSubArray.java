package Arrays;
import java.util.*;

public class maxSubArray {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int currentSum = 0;
        int maximumSum = 0;
        int left =-1;
        int right = -1;
        
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        //Generate all subArrays
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                // Elements of SubArray(i,j)
                currentSum = 0;
                
                for(int k=i; k<=j; k++) {
                    currentSum += a[k];
                }
                
                // update maximumSum if CurrentSum > maximumSum
                if(currentSum > maximumSum) {
                    maximumSum = currentSum;
                    left = i;
                    right = j;
                }
            }
        }
        
        System.out.println("Maximum Sum is " + maximumSum);
        
        for(int k=left; k<=right; k++) {
            System.out.print(a[k]+",");
        }
    }
}
