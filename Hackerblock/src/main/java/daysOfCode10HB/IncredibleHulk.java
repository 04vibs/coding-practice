package daysOfCode10HB;
import java.util.*;

public class IncredibleHulk {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        
        while(testcases != 0) {
            int ans = 0;
            int n = input.nextInt();
            while(n>0) {
             n = n & (n-1);
             ans++;
            }
            System.out.println(ans);
            
            testcases--;
        }
    }
}
