// given a sorted array. Find pair of elements that sum to K.
// Two pointer approach is only applicable if sorted array is given

package Arrays;
import java.util.*;

public class pairWiseSumProblem {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a[] = {1,3,5,7,10,11,12,13};
        int sum = 16;
        int i=0;
        int j = a.length/2 -1;
        System.out.println("j"+ j);
        
        while(i<j) {
            int currentSum = a[i] +a[j];
            if(currentSum > sum) {j--;}
            else if(currentSum < sum ) {i++;}
            else if(currentSum == sum) {
                System.out.print("pair" + a[i]+" " +a[j]);
                i++;
                j--;
            }
        }
    }
}
