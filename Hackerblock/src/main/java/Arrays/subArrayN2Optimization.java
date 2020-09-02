package Arrays;
import java.util.*;

public class subArrayN2Optimization {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int a[] = new int[n];
        int cumSum[] = new int[n];
        
        int currentSum =0;
        int maximumSum=0;
        int left = -1;
        int right = -1;
        
        a[0] = input.nextInt();
        cumSum[0] = a[0];
        for(int i=1; i<n; i++) {
            a[i] = input.nextInt();
            cumSum[i] = cumSum[i-1] + a[i];
            System.out.println("cum sum"+ cumSum);
        }
        
        //generate all subArrays
        for(int i=0; i<n; i++) {
            for(int j=1; j<n; j++) {
                
               currentSum =0;
               currentSum = cumSum[j] - cumSum[i-1];
                if(currentSum > maximumSum) {
                    maximumSum = currentSum;
                    left =i;
                    right =j;
                    System.out.println("max sum"+ maximumSum);
                }
            }
        }
        System.out.println("Maximum Sum is "+ maximumSum);
        for(int k=left; k<=right;k++) {
            System.out.print(a[k]);
        }
        
    }
}
